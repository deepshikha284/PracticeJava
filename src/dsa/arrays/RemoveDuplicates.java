package dsa.arrays;

public class RemoveDuplicates {
    static int remDups(int arr[], int n){
        int res = 1;
        for (int i=0; i<n; i++){
            if (arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr[]={10,10,20,30,40,40};
        int n= 6;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
