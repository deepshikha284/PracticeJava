package basicjava;

import java.util.Scanner;

public class Day {
    public static void main(String args[]) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number");
        i = sc.nextInt();

        switch (i) {
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THUR");
                break;
            case 5:
                System.out.println("FRI");
                break;

            case 6:
                System.out.println("SAT");
                break;


            case 7:
                System.out.println("SUN");
                break;

            default:
                System.out.println("Invalid number");
        }
    }


}
