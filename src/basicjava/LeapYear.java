package basicjava;

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        i = sc.nextInt();

        if (i % 4 == 0) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }
}
