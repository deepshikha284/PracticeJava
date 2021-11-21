package basicjava;

import java.util.Scanner;
public class Hero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter level\n");
        int level = sc.nextInt();
        System.out.println("Enter Superhero name");
        String sname = sc.nextLine();
        for (int i = 1; i <= level; i++) {
            if (level > 50 || level < 1) {
                System.out.println("Invalid level");
            }
            if (sname.equals("Mr. India") && (i > 3 && i < 5)) {
                continue;
            }
            if (sname.equals("Hulk")  && i > 10) {
                break;
            }
            System.out.println(sname + " has reached " + i +" level out of total " + level + " level");
            if (sname.equals("Spiderman")  && (i == 1 || i % 5 == 1)) {
                System.out.println(sname + " " + i);
            }
        }
    }
}