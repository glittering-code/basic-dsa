// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static int[] ReverseArray(int [] arr) {
        int [] ret = new int[arr.length];
        for(int  i = 0,j=arr.length-1 ; i < arr.length ; ++i,--j) {
            ret[j] = arr[i];
        }
        return ret;
    }
    public static void print(int [] arr) {
        for(int  i = 0 ; i < arr.length ; ++i) {
            System.out.print(arr[i] + "\t");
        }
    }
    public static void main(String[] args) {
        int [] arr = {3,4,21,-9,10,18,-54};
        int [] rev = ReverseArray(arr);
        print(rev);
        //PrintArrayReverse(arr);
        //System.out.println("Try programiz.pro");
    }
}
