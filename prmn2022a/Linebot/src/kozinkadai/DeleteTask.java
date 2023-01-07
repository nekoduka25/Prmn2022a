package kozinkadai;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeleteTask {

    int day;
    int month;

    public DeleteTask(int day,int month){

        this.day = day;
        this.month = month;

        BufferedWriter bw = null;

        Scanner input = new Scanner(System.in);

        try{
            File file = new File("c:\\Tasks\\"+this.month+"\\"+this.day+"\\"+this.day+".txt");
            bw = new BufferedWriter(new FileWriter(file));

            bw.write("");
            bw.newLine();
            bw.flush();
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bw != null) {
                    bw.close();
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
