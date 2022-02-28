/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class recursion
{
    public static int fibonacci(int n) {
        if(n < 0) {
            System.out.println("n can't be less than 0");
            return -1;
        }
        if(n == 0) 
            return 0;
        if(n == 1)
            return 1;
        int answer = fibonacci(n-1) + fibonacci(n-2);
        return answer;
    }
    public static void test(int n) {
        if(n < 1)
            return;
        System.out.println("n = " + n);
        test(n-1);
        System.out.println("n == " + n);
    }
    public static int facotrial(int n) {
        if(n < 0) {
            System.out.println("negative Number not allowed");
            return -1;
        }
        if(n == 0) 
            return 1;
        int answer = n * facotrial(n-1);
        return answer;
    }
    public static int sum_recr(int n) { // sum_recr(-2);
        if(n <= 0)
            return 0;
        int sum = n + sum_recr(n-1);
        return sum;
    }
    public static int sum(int n) {
        int sum = 0;
        for(int i = 1 ; i <= n ; ++i) {
            sum += i;
        }
        return sum;
    }
    public static int factTR(int n, int a) {
        if(n == 0) 
            return a;
        return factTR(n-1,a*n); //(3,4), (2,12) , (1,24), (0,24)
    }
	public static void main(String[] args) {
	    int answer = sum_recr(5);
	    int pd = factTR(4,1);
	    System.out.println("fact = "+ pd);
	    test(3);
		//System.out.println("Hello World");
	}
}

