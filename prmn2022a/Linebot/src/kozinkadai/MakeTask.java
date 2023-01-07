package kozinkadai;

import java.io.*;
import java.util.Scanner;

public class MakeTask {

    int day;
    int month;
    public MakeTask(int day,int month){

        this.day = day;
        this.month = month;

        BufferedWriter bw = null;

        Scanner input = new Scanner(System.in);

        try{
            File file = new File("c:\\Tasks\\"+this.month+"\\"+this.day+"\\"+this.day+".txt");
            bw = new BufferedWriter(new FileWriter(file));

            System.out.println("taskを入力");
            String task = input.nextLine();
            bw.write(task);
            bw.newLine();
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
