package basicjava;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = sc.nextInt();


        int rd = i;
        while(rd > 0) {
            int ld = rd % 10;
            rd = rd / 10;
            System.out.print(ld);
        }
    }
}
