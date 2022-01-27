package dsa.arrays;

public class LargestElement {
    static int getLargest(int arr[], int n) {
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[res])
                res = i;
            return res;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={3,5,20,10,9};
        int n=5;

        System.out.println(getLargest(arr, n));
    }
}
