package kozinkadai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {

    int day;
    int month;

    public ReadText(int day,int month){

        this.day = day;
        this.month = month;

        try {
            // ファイルのパスを指定する
            File file = new File("c:\\Tasks\\"+this.month+"\\"+this.day+"\\"+this.day+".txt");

            // ファイルが存在しない場合に例外が発生するので確認する
            if (!file.exists()) {
                System.out.print("ファイルが存在しません");
                return;
            }

            // BufferedReaderクラスのreadLineメソッドを使って1行ずつ読み込み表示する
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.print(data);
            }

            // 最後にファイルを閉じてリソースを開放する
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
