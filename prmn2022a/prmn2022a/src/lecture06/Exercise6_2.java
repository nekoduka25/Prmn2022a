package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("サイコロを5個振りました");

        for(int i = 0;i < 5;i++){
            list.add(random.nextInt(6) + 1);
        }


        try{

            System.out.println("何番目のサイコロの値を確認しますか？");
            int a = input.nextInt();
            int b = a - 1;
            System.out.println(list.get(b));
        }
        catch(InputMismatchException e){
            System.out.println("整数以外の値が入力されました");
            System.out.println("プログラムを終了します");


        }
        catch(IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました");
            System.out.println("プログラムを終了します");

        }



    }
}
