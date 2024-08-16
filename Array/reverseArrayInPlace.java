// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void ReverseArrayInPlace(int [] arr) {
        for(int i = 0,j=arr.length-1; i < arr.length/2 ; ++i,--j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void print(int [] arr) {
        for(int  i = 0 ; i < arr.length ; ++i) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {3,4,21,-9,10,18,-54}; //odd number of elements
        ReverseArrayInPlace(arr);
        print(arr);
        
        int [] arr1 = {2,1,4,3,6,10};//even number of elements
        ReverseArrayInPlace(arr1);
        print(arr1);
        
    }
}
