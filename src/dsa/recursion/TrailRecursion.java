package dsa.recursion;

public class TrailRecursion {
    static void fun(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        fun(n - 1);
    }
    public static void main(String[] args) {
        fun(3);
    }
}
