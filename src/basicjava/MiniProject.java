package basicjava;

import java.util.Scanner;

public class MiniProject {


   static int userNumber = 0;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double randomVal= Math.random();
        int myNumber = (int) (randomVal * 100);

        System.out.println("Random Value: "+randomVal+", My number : "+myNumber);
        do {
            System.out.println("Guess my number :");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("Whoohoo! Correct Number");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Number is too large");
            } else {
                System.out.println("Number is too small");
            }
        } while (userNumber >= 0);
        System.out.println("My number was : ");
        System.out.println(myNumber);

    }
}
