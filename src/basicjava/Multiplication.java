package basicjava;

import java.util.Scanner;

public class Multiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = sc.nextInt();

        for (int j = 1; j <= 10; j++) {
            System.out.println(i + "X" + j + "=" + (i * j));
        }

    }
}
