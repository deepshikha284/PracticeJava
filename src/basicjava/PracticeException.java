package basicjava;

public class PracticeException {
    public static void main (String args[]){
        int arr[]=new int[3]; // Declaration(array name with size)
//        i[0]=2;
//        i[1]=3;
//        i[2]=4;
        int newArr[]={2,3,4};// Declaration(array name with size) and assignment/initialization of values

        try{
            int n=10/2;
            System.out.println(n);
            //System.out.println( i[2]);
        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException");
//        }
//        catch (ArithmeticException e){
//            System.out.println("ArithmeticException");
//        }
        finally{
            System.out.println("Always print this");
        }
    }
}
