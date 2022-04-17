import java.util.HashMap;

public class Main {
  /*int findOddNumber_native(int [] arr) {
    Map<Integer,Integer> m = new HashMap();

  }*/
  public static int findOddNumber(int [] arr) {
    int ret = 0;
    for(int i = 0 ; i < arr.length ; ++i) {
      ret = ret^arr[i];
    }
    return ret;
  }
  public static int checkNthBit(int x, int n) {
    int temp = x>>n;
    int ans = temp&1;
    return ans;
  }
  public static boolean isEven(int x) {
    int bit = checkNthBit(x,0);
    if(bit == 0)
      return true;
    return false;
  }
  public static boolean isOdd(int x) {
    int bit = x&1;
    if(bit  == 1)
      return true;
    return false;
  }
  public static int setNthBit(int x, int n) {
    int z = 1 << n;
    int result = x|z;
    return result;
  }
  public static int resetNthBit(int x, int n) {
    int z = 1 << n;
    z = ~z;
    int result = x&z;
    return result;
  }
  // O(number of set bits)
  public static int BKCountSetBits(int x) {
    int count = 0;
    while(x != 0) {
      int a = x-1;
      x = x&a;
      count++;
    }
    return count;
  }
  // naive approach
  public static int countBits(int x) { // O(b) = O(logn) where n in the number = O(b) where b is number of bits
    int count = 0;
    while(x != 0) {
      int z = x&1;
      if(z == 1)
        count++;
      x = x>>1;
    }
    return count;
  }
  public static  void main(String [] args) {
    /*int [] arr = {1,1,2,3,4,5,5,3,2};
    int ans = findOddNumber(arr);
    System.out.println("answer is "+ans);*/
    //int a = 1234567;
    /*int b = a>>2; // a/2^b = 34/2^2 = 34/4 = 8
    System.out.println("b = "+b);
    b = a<<3; // a*2^b = 34*2^3 = 34*8 = 272
    System.out.println("b = "+b);*/
    /*int res = checkNthBit(a,1);
    System.out.println(Integer.toBinaryString(a));
    System.out.println("res = "+res );
    if(isEven(a)) {
      System.out.println(a+" is even number\n");
    } else {
      System.out.println(a+" is odd number\n");
    }*/
    int x = 0b10000000000; // O(10)
    int result = BKCountSetBits(x);
    System.out.println(result);
  }

}
