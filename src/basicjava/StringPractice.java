package basicjava;

public class StringPractice {

    public static void main(String args[]) {
        String str1 = "Java";
        String str2 = new String("Java");
        char c[] = {'H', 'e', 'l', 'l', 'o'};

        String str3 = new String(c, 1, 3);
        // System.out.println(str3);

        String str4 = "Mr. Salman Khan";
        int i;
        for (i = 0; i < str4.length(); i++) {
            //  System.out.print(str4.charAt(i));
        }


        String str5 = "b5";
        // System.out.println(str5.matches("[a-z][0-9]"));

        String str = "Programmer@gmail.com";
        int a = str.indexOf("@");
        String uname = str.substring(0, a);
        String Domain = str.substring(a + 1, str.length());

        // System.out.println(uname);
        // System.out.println(Domain);

        //System.out.println(Domain.startsWith ("gmail"));

        String str6 = ("Good morning to all");
        //str6=str6.replaceAll("\\s","").trim();
        System.out.println(str6);
        String words[] = str6.split("\\s");
        System.out.println(words.length);

    }
}
