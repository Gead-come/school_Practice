import java.io.IOException;
import java.util.List;

public class Start {
    public static void main(String[] args) throws IOException {
        List<ZipcodeInfo> dataList = CsvDataLoader.loadZipcodeData(); // データを読み込む
        ZipcodeSearchApp app = new ZipcodeSearchApp(dataList); // アプリケーションを初期化
        /*
        アプリケーションを起動
        */
        app.start();

    }
}





