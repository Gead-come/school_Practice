import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ZipcodeSearchApp {
    // 郵便番号データのリスト
    private final List<ZipcodeInfo> dataList;
    // ユーザー入力用スキャナ
    private final Scanner sc = new Scanner(System.in);

    // コンストラクタ：郵便番号データを受け取る
    public ZipcodeSearchApp(List<ZipcodeInfo> dataList) {
        this.dataList = dataList;
    }

    // メインメニューの起動
    public void start() {
        while (true) {
            System.out.println("\n====== 郵便番号検索システム ======");
            System.out.println("1: 郵便番号（前方一致）で検索");
            System.out.println("2: 住所（都道府県 + 市区町村）で検索");
            System.out.println("3: プログラムを終了");
            System.out.print("操作を選択してください（1～3）：");

            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1" -> searchByCode();
                case "2" -> searchByAddress();
                case "3" -> {
                    System.out.println("👋 プログラムを終了します。");
                    return;
                }
                default -> System.out.println("❌ 無効な選択です。もう一度入力してください。");
            }
        }
    }

    // 郵便番号で検索（前方一致）
    private void searchByCode() {
        System.out.print("1～7桁の郵便番号を入力してください：");
        String code = sc.nextLine().trim();

        if (!code.matches("\\d{1,7}")) {
            System.out.println("❌ 無効な入力です。1～7桁の数字を入力してください。");
            return;
        }

        int pageSize = inputPageSize();  // ページサイズを入力

        List<ZipcodeInfo> result = dataList.stream() //
                .filter(z -> z.getCode().startsWith(code))
                .sorted(Comparator.comparing(ZipcodeInfo::getCode)
                        .thenComparing(ZipcodeInfo::getKana1)
                        .thenComparing(ZipcodeInfo::getKana2)
                        .thenComparing(ZipcodeInfo::getKana3))
                .toList();

        showResults(result, pageSize);
    }

    // 住所（都道府県＋市区町村）で検索
    private void searchByAddress() {
        System.out.print("都道府県を入力してください（例：東京都）：");
        String ken = sc.nextLine().trim();

        System.out.print("市区町村を入力してください（例：江東区豊洲）：");
        String city = sc.nextLine().trim();

        int pageSize = inputPageSize();

        List<ZipcodeInfo> result = dataList.stream()
                .filter(z -> z.getKanji1().equals(ken) && z.getKanji2().startsWith(city))
                .sorted(Comparator.comparing(ZipcodeInfo::getKana1)
                        .thenComparing(ZipcodeInfo::getKana2)
                        .thenComparing(ZipcodeInfo::getKana3))
                .toList();

        showResults(result, pageSize);
    }

    // 1ページあたりの表示件数を取得
    private int inputPageSize() {
        while (true) {
            System.out.print("1ページあたりの表示件数を入力してください（正の整数）：");
            String input = sc.nextLine().trim();
            try {
                int n = Integer.parseInt(input);
                if (n > 0) return n;
            } catch (NumberFormatException ignored) {
            }
            System.out.println("❌ 無効な数値です。正の整数を入力してください。");
        }
    }

    // 検索結果をページごとに表示
    private void showResults(List<ZipcodeInfo> result, int pageSize) {
        if (result.isEmpty()) {
            System.out.println("🔍 該当するデータは見つかりませんでした。");
            return;
        }

        int total = result.size();
        int page = 0;

        while (page * pageSize < total) {
            int start = page * pageSize;
            int end = Math.min(start + pageSize, total);

            System.out.printf("---- 第 %d ページ ----%n", page + 1);
            for (int i = start; i < end; i++) {
                System.out.println(result.get(i));
            }

            System.out.printf("📊 表示中：%d ～ %d ／ 全 %d 件%n", start + 1, end, total);

            if (end == total) break;

            System.out.print("次のページを表示しますか？（y/n）：");
            if (!sc.nextLine().trim().equalsIgnoreCase("y")) break;

            page++;
        }
    }
}
