package lecture03;

import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {
        System.out.println("任意の文字列を入力してください");
        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.println(s + "と入力されました");
    }
}
