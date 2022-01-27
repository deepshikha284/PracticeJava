package gfg;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // T is number of test cases
        for (int i = 1; i <= T; i++) {
            int tax = 0;
            int N = sc.nextInt(); //N is salary
            if (N <= 1000) {
                tax = 0;
            } else if (N > 1000 && N <= 100000) {
                tax = N*10/100;
            } else if (N > 100000 && N <= 1000000) {
                tax = N*20/100;
            } else {
                tax = N*25/100;
            }
            System.out.println(tax);

        }

    }
}
