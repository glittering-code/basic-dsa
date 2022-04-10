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
  public static  void main(String [] args) {
    int [] arr = {1,1,2,3,4,5,5,3,2};
    int ans = findOddNumber(arr);
    System.out.println("answer is "+ans);
    int a = 31;
    /*int b = a>>2; // a/2^b = 34/2^2 = 34/4 = 8
    System.out.println("b = "+b);
    b = a<<3; // a*2^b = 34*2^3 = 34*8 = 272
    System.out.println("b = "+b);*/
    int res = checkNthBit(a,1);
    System.out.println(Integer.toBinaryString(a));
    System.out.println("res = "+res );
  }

}
