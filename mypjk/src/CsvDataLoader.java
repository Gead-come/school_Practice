import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class CsvDataLoader {

    private static final String DATA_FILE = "C:\\Users\\Webデザイン科\\IdeaProjects\\untitled\\mypjk\\郵便番号データ.csv";

    public static List<ZipcodeInfo> loadZipcodeData() {

        try {
            List<ZipcodeInfo> zipcodeInfos = ZipcodeInfo.loadFromCsv(DATA_FILE);
            System.out.println("✅ 読み込みに成功しました。 " + zipcodeInfos.size() + " 個のレコードが読み込まれました。");
            return zipcodeInfos;
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("❌ 読み込みに失敗しました。");
            return Collections.emptyList();

        }

    }

}
