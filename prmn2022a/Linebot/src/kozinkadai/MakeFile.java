package kozinkadai;

import java.io.File;
import java.io.IOException;


public class MakeFile {

    int day;
    int month;

    public void maketxt(int day,int month){
        this.day = day;
        this.month = month;

        File newFile = new File("c:\\Tasks\\"+this.month+"\\"+this.day+"\\"+this.day+".txt");
        try {
            if (newFile.createNewFile()) {
                //System.out.println("新規ファイル作成成功");
            } else {
                //System.out.println("新規ファイル作成失敗");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}