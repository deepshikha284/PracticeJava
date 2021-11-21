package basicjava;

import java.util.Scanner;

public class Switch {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a domain name");
        String domain = scan.nextLine();

        String ext = domain.substring(domain.lastIndexOf(".") + 1);

        switch (ext) {
            case "com":
                System.out.println("Commercial");
                break;

            case "org":
                System.out.println("Organization");
                break;

            case "gov":
                System.out.println("Government");
                break;
        }
    }
}