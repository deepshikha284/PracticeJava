package dsa.recursion;

public class RecursionOutput1 {
    static void fun(int n) {
        if (n == 0)
            return;
        fun(n - 1);
        System.out.print(n+" ");
        fun(n - 1);
    }
    public static void main(String[] args) {
        fun(3);
    }
}

