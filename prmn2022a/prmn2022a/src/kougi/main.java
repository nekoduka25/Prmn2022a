package kougi;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("年齢を入力");
        int a = input.nextInt();
        nenrei n = new nenrei(a);

    }
}
