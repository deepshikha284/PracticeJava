package dsa.recursion;

public class Factorial {
    static int fact(int n){
        if (n==1){
            return 1;
        }
        n = n * fact(n-1);
        return n;
    }
    public static void main(String args[]){
        int res = fact(4);
        System.out.println(res);
    }
}
