// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;  
class HelloWorld {
    public static void bubbleSort(int[] arr) {
        for(int i = 0 ; i < arr.length-1 ; ++i) {
            System.out.println("i =" + i);
            for(int j = 0 ; j < arr.length-1-i ; ++j) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }
    }
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5,6,7};
       bubbleSort(arr);
       System.out.println(Arrays.toString(arr));

    }
}
