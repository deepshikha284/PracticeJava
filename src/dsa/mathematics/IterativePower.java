package dsa.mathematics;

public class IterativePower {
    static int power(int x, int n){
        int res=1;
        while(n>0){
            if (n%2!=0)
                res=res*x;
            x=x*x;
            n=n/2;
        }
        return res;
    }
    public static void main(String args[]){
        int x=4;
        int n=5;
        System.out.println(power(x,n));
    }
}
