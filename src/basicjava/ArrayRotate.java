package basicjava;

public class ArrayRotate {
    public static void main(String args[]){
        int arr[]={3,5,8,6,9};
        int temp=arr[0];
        for (int i=1;i<arr.length;i++){
        arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;

        for (int x:arr){
            System.out.print(x);
        }
    }
}
