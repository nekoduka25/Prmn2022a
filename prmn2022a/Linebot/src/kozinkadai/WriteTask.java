package kozinkadai;

import java.util.Scanner;

public class WriteTask {


    public WriteTask(){

        while(true){
            System.out.println("Taskを設定 → 1");
            System.out.println("Taskを削除 → 2");
            System.out.println("Taskを確認 → 3");
            System.out.println("終了 → 0");

            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            if(number == 1) {
                System.out.println("月は？");
                int month = input.nextInt();
                System.out.println("日にちは？");
                int day = input.nextInt();
                MakeTask mt = new MakeTask(day,month);
            }else if(number == 2){
                System.out.println("月は？");
                int month2 = input.nextInt();
                System.out.println("日にちは？");
                int day2 = input.nextInt();
                DeleteTask dt = new DeleteTask(day2,month2);
            }else if(number == 3){
                System.out.println("月は？");
                int month3 = input.nextInt();
                System.out.println("日にちは？");
                int day3 = input.nextInt();
                ReadText rt = new ReadText(day3,month3);
            }else if(number == 0){
                break;
            }
        }

    }
}
