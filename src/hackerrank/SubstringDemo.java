package hackerrank;

import java.util.Scanner;

public class SubstringDemo {
    public static String getSmallestAndLargest(String s, int k) {
        int N = s.length();
        java.util.Set<String> set = new java.util.TreeSet<>();
        for(int i=0; i<=N-k; i++){
            int j = k;
            int idxCount=0;
            StringBuilder sb = new StringBuilder();
            while(j-- > 0) { // if k is 3, then put 3 letters in sb
                if(i+idxCount < N) {
                    char letter = s.charAt(i+idxCount);
                    sb.append(letter);
                    idxCount++;
                }
            }
            set.add(sb.toString());
        }
        java.util.List<String> l = new java.util.ArrayList<>(set);
        String smallest = l.get(0);
        String largest = l.get(l.size()-1);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //String s = scan.next();
        //int k = scan.nextInt();
        //scan.close();

        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }
}
