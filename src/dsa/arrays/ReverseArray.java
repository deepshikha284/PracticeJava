package dsa.arrays;

import org.w3c.dom.ls.LSOutput;

public class ReverseArray {
    static int reverse(int arr[], int n){
        int low=0;
        int high=n-1;
        while (low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = 5;
        reverse(arr, n);
        for (int i=0; i<n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
