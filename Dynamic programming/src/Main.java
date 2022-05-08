public class Main {
  //2^n
// O(N) O(n)
  //O(2^n) O(1)
  public static int fib_DP(int n, int [] fib_arr) {
    if(n < 0) {
      System.out.println("input to the fiboancci series can't be negative");
      return -1;  //Integer.MIN_VALUE;
    }
    if(fib_arr[n] != -1) {
      return fib_arr[n];
    }
    if(n == 0) {
      fib_arr[n] = 0;
      return 0;
    }
    if(n==1) {
      fib_arr[n] = 0;
      return 1;
    }
    int out = fib_DP(n-1,fib_arr) + fib_DP(n-2,fib_arr);
    fib_arr[n] = out;
    return out;

  }
  public static int fib_bup(int n, int [] fib_arr) {

    // 0 1 1 2 3 5
    // n, n
    for(int i = 0 ; i <=n ; ++i) {
      if(i == 0){
        fib_arr[i] = 0;
      } else  if(i == 1){
        fib_arr[i] = 1;
      } else {
        fib_arr[i] = fib_arr[i - 1] + fib_arr[i - 2];
      }
    }
    return fib_arr[n];
  }
  public static int fibonacci(int n) {
    if(n < 0) {
      System.out.println("input to the fiboancci series can't be negative");
      return -1;  //Integer.MIN_VALUE;
    }
    if(n == 0)
      return 0;
    if(n==1)
      return 1;
    return fibonacci(n-1) + fibonacci(n-2);
  }
  /* 5
  4th             and               3rd
  3rd and 2nd                    2nd and 1st

  */
  /*
  int [] wt = {1,2,3,4,5};
    int [] val = {12,10,14,17,20};
  */

  public static int knapSack(int n, int cap, int [] wt, int [] val) {
      if(n == 0)
        return 0;
      if(cap <= 0)
        return 0;

      int a = knapSack(n-1,cap,wt,val);
      if(wt[n-1] > cap)
        return a;
      int b = knapSack(n-1,cap-wt[n-1],wt,val)+val[n-1];
      return Math.max(a,b);
  }
  public static int knapsack_memorization(int n, int cap, int [] wt, int [] val, int [][] mem) {
    if(n == 0) {
      mem[n][cap] = 0;
      return 0;
    }
    if(cap <= 0) {
      mem[n][cap] = 0;
      return 0;
    }

    if(mem[n][cap] != -1)
      return mem[n][cap];

    int a = knapSack(n-1,cap,wt,val);
    if(wt[n-1] > cap) {
      mem[n][cap] = a;
      return a;
    }
    int b = knapSack(n-1,cap-wt[n-1],wt,val)+val[n-1];
    int ret = Math.max(a,b);
    mem[n][cap] = ret;
    return ret;
  }
  public static void main(String [] args) {
    int a = 12;

    int [] fib_arr = new int[a+1];
    for(int i = 0 ; i <= a ; ++i) {
      fib_arr[i] = -1;
    }
    //int out = fib_DP(a,fib_arr);

    //System.out.println(a + "th term in fibonacci series is "+ out);
    int [] wt = {1,2,3,4,5};
    int [] val = {12,10,14,17,20};
    int cap = 5;
    int [] [] mem = new int[wt.length+1][cap+1];
    for(int i = 0 ; i < mem.length ; ++i) {
      for(int j = 0 ; j < mem[0].length ; ++j) {
        mem[i][j] = -1;
      }
    }
    //(cap+1)*(n+1) = n*cap - time
    //(n+1) *(cap+1) = n*cap - space
    int output = knapsack_memorization(wt.length,cap,wt,val,mem);
    System.out.println("result is = " + output);
  }
}
