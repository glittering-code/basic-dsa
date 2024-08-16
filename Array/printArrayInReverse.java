// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void PrintArrayReverse(int [] arr) {
        for(int  i = arr.length-1 ; i >= 0 ; --i) {
            System.out.print(arr[i] + "\t");
        }
    }
    public static void main(String[] args) {
        int [] arr = {3,4,21,-9,10,18,-54};
        PrintArrayReverse(arr);
        //System.out.println("Try programiz.pro");
    }
}
