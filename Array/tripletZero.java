// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// *****************leetcode link ***********************   
// https://www.geeksforgeeks.org/find-triplets-array-whose-sum-equal-zero/
//****************************************************************
class HelloWorld {
  // brute force appraoch with n^3 complexity
    public static boolean checkTripletZero(int [] arr) {
        for(int i = 0 ; i < arr.length ; ++i) {
            for(int j = i+1 ; j < arr.length ; ++j) {
                for(int k = j+1 ; k < arr.length ; ++k) {
                    if(arr[i] + arr[j] + arr[k] == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        boolean b = checkTripletZero(arr);
        System.out.println(b);
        int [] arr1 = {1,2,-1,-2,-3,0,5};
        b = checkTripletZero(arr1);
        System.out.println(b);
    }
}
