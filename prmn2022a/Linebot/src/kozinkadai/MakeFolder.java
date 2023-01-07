package kozinkadai;

import java.io.File;

public class MakeFolder {

    int day;
    int month = 2;

    public void makemainfolder(){
        File file = new File("c:\\Tasks");

        if (file.mkdirs()) {
            //System.out.println("フォルダの作成に成功しました");
        } else {
            //System.out.println("フォルダの作成に失敗しました");
        }
    }

    public void makesubfolder(int day,int month){
        this.day = day;
        this.month = month;
        File file2 = new File("c:\\Tasks\\"+this.month+"\\"+this.day);

        if (file2.mkdirs()) {
            //System.out.println("フォルダの作成に成功しました");
        } else {
            //System.out.println("フォルダの作成に失敗しました");
        }
    }

}