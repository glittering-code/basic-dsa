/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Stack;
public class Main
{
    public static int prec(char ch) {
        if(ch == '+' || ch == '-') {
            return 1;
        } else if(ch == '*' || ch == '/') {
            return 2;
        } else if(ch == '^') {
            return 3;
        }
        return -1;
    }
    public static char[] infixToPostfix(char [] infix) {
        char [] postfix = new char[infix.length];
        Stack<Character> s = new Stack<Character>();
        int j = 0;
        for(int i = 0 ; i < infix.length ; ++i) {
            char ch = infix[i]; // read the Character
            if(Character.isLetterOrDigit(ch)) { //operand
                postfix[j] = ch;
                j++;
            } else if(ch == '(') { // opening braces
                s.push(ch);
            } else if(ch == ')') { // closing braces
                while(s.peek() != '(') {
                    postfix[j] = s.pop();
                    j++;
                }
                s.pop();
            } else { //operator
                while(s.isEmpty() == false && prec(s.peek()) >= prec(ch) ) {
                    postfix[j] = s.pop();
                    j++;
                } 
                s.push(ch);
            }
        }
        while(s.isEmpty() == false) {
            postfix[j] = s.pop();
            j++;
            //i++;
        }
        return postfix;
    }
	public static void main(String[] args) {
	    //String s = 
	    String infix = "K+L-M*N+(O^P)*W/U/V*T+Q";
	    char [] postfix = infixToPostfix(infix.toCharArray());
	    for(int i = 0 ; i < postfix.length ; ++i) {
	        System.out.print(postfix[i]);
	    }
		//System.out.println("Hello World");
	}
}

