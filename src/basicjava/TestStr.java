package basicjava;

import java.util.Arrays;

public class TestStr {

    public static void main(String args[]) {
        //    String name="Santu and Deepa";
        //  String neighbour="Deepa";
        // String friend=neighbour;
        // String name2=name.replace('a', 'b');

        // System.out.println(friend);
        //  System.out.println(name.length());
        //  System.out.println(name.charAt(3));
        // System.out.println(name.substring(6,10));
        //  System.out.println(name2);

        //  int marks[]={89,76,90,59};
        //  System.out.println(marks[0]);
        //  Arrays.sort(marks);
        //   System.out.println(marks[0]);
        //  System.out.println(Math.min(3, 4));
        //  System.out.println(Math.max(3, 4));


       // int i = 1;
       // do {
       //     System.out.println(i);
      //      i++;
       // } while (i <= 100);

        int i = 0;
        while(true){
            if (i==3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
            if (i>5){
            break;

            }
        }
    }
}
