package basicjava;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = sc.nextInt();
        int result = 1;
        for (int j = i; j >= 1; j--) {
            result = result * j;
        }
        System.out.println("basicjava.Factorial is " + result);
    }
}
