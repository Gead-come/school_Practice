import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.nio.file.*;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZipcodeInfo {
    private String code;       // 郵便番号（7桁）
    private String kana1;      // 住所カナ1（都道府県）
    private String kana2;      // 住所カナ2（市区町村）
    private String kana3;        // 住所カナ3（町域）
    private String kanji1;     // 住所漢字1（都道府県）
    private String kanji2;     // 住所漢字2（市区町村）
    private String kanji3;     // 住所漢字3（町域）


    @Override
    public String toString() {
        return code + "：" + kanji1 + kanji2 + kanji3;
    }

    // CSVファイルからデータを読み込む
    public static List<ZipcodeInfo> loadFromCsv(String filePath) throws IOException {
        List<ZipcodeInfo> result = new ArrayList<>();
        Path path = Paths.get(filePath);
        List<String> lines = Files.readAllLines(path);

        // CSV行解析
        for (String line : lines) {
            String[] columns = line.split(",");
            if (columns.length >= 9) {
                result.add(new ZipcodeInfo(
                        columns[2], // 郵便番号
                        columns[3], columns[4], columns[5], // カナ
                        columns[6], columns[7], columns[8]  // 漢字
                ));
            }
        }

        return result;
    }
}