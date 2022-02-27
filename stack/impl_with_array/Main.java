/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    stack s = new stack(5);
	    //s.pop();
	    s.push(1);
	    s.push(2);
	    s.push(3);
	    s.push(4);
	    s.push(5);
	    s.push(6);
	    while(s.isEmpty() == false) {
	        int item  = s.pop();
	        System.out.print(item + "\t");
	    }
	    System.out.println("\n");
		//System.out.println("Hello World");
	}
}
