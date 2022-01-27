package dsa.searching;

public class RepeatingElement2 {
    static int repeat(int arr[], int n) {
        int slow = arr[0], fast = arr[0];
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    public static void main(String args[]) {
        int arr[] = {1, 3, 2, 4, 6, 5, 7, 3}, n = 8;
        System.out.println(repeat(arr, n));
    }
}

