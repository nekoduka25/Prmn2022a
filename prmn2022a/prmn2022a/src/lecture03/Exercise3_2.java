package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {

    public static void main(String[] args) {

        System.out.println("何行分入力しますか？");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        ArrayList<String> arrayList = new ArrayList<>();

        for(int i = 0; i < num; i++){
            System.out.println(i + 1 + "行目：");
            String s = input.next();
            arrayList.add(s);

        }


    }
}
