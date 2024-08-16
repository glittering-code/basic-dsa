// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void findMaxMin(int [] arr) {
        int max = arr[0];
        int min = arr[0];
        for(int i = 1 ; i < arr.length ; ++i) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("maximum element is "+ max);
        System.out.println("minimum element is "+ min);
    }
    public static void print(int [] arr) {
        for(int  i = 0 ; i < arr.length ; ++i) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {3,4,21,-9,10,18,-54}; //odd number of elements
        findMaxMin(arr);
        
        //PrintArrayReverse(arr);
        //System.out.println("Try programiz.pro");
    }
}
