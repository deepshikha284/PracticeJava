package basicjava;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = sc.nextInt();

        for(int a=1;a<=5;a++){
        for(int b=1;b<=5;b++){
            System.out.print(b+" ");
        }
            System.out.println("");
        }
    }
}
