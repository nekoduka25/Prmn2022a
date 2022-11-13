package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {

    public static void main(String[] args) {
        System.out.println("何行分入力しますか？");
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
        ArrayList<Exercise3_2> e = new ArrayList<>();

        for(int i = 0; i > line; i++){
            System.out.println("1行目：");
            int s = input.nextInt();
            e.add(new Exercise3_2());

        }


    }
}
