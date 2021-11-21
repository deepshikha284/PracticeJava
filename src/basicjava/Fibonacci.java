package basicjava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = sc.nextInt();

        int a=0;
        int b = 1;
        int result = 0;

        System.out.print(a + "," + b + ",");
        for (int n = 2; n < i; n++) {
            result = a + b;
            System.out.print(result);
            if(n != (i-1)) {
                System.out.print(",");
            }
            a = b;
            b = result;
        }


    }
}
