package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        System.out.println("1つ目の整数を入力してください：");
        Scanner input = new Scanner(System.in);
        String a = input.next();
        System.out.println("2つ目の整数を入力してください：");
        String b = input.next();

        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);

        int ans = c + d;
        System.out.println(c + " + " + d + " = " + ans);




    }
}
