// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static int[] count(int [] arr) {
        int [] cnt = new int[3]; 
        //cnt[0] will have count of 0
        //cnt[1] will have count of +ves
        //cnt[2] will have count of -ves
        for(int i = 0 ; i < arr.length ; ++i) {
            if(arr[i] == 0) {
                cnt[0]++;
            } else if(arr[i] > 0) {
                cnt[1]++;
            } else {
                cnt[2]++;
            }
        }
        return cnt;
    }
    public static void print(int [] arr) {
        for(int  i = 0 ; i < arr.length ; ++i) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {3,4,21,-9,10,18,-54}; //odd number of elements
        int[] count = count(arr);
        System.out.println("number of 0s " + count[0]);
        System.out.println("number of +ves " + count[1]);
        System.out.println("number of -ves " + count[2]);
        
        
        //PrintArrayReverse(arr);
        //System.out.println("Try programiz.pro");
    }
}
