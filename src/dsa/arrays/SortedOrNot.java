package dsa.arrays;

public class SortedOrNot {
    static boolean isSorted(int arr[], int n){
        for (int i=0; i<arr.length; i++){
            for (int j=i+i; j<arr.length; j++){
                if(arr[j]<arr[i])
                    return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int arr[]={2,5,7,8};
        int n=4;
        System.out.println(isSorted(arr, n));
    }
}
