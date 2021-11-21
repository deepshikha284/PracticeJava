package basicjava;

import java.util.Scanner;

public class Expression {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int a,b,c;
        double r1,r2;

        System.out.println("Enter values of a, b and c ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double sqrt = Math.sqrt(b*b-4*a*c);
        r1=(-b+sqrt)/(2*a);
        r2=(-b-sqrt)/(2*a);

        System.out.println("Roots are "+r1+" "+r2);


    }
}
