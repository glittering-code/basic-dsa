// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;  

class HelloWorld {
    public static void func() {
        int n = 21;
        System.out.println("Welcome to the Game. Please read the rules carefully");
        System.out.println("===============================");
        System.out.println("\tThere are total 21 mathsticks");
        System.out.println("\tyou can pick 1,2,3 or 4 matchsticks");
        System.out.println("\tWhoever is forced to pick up the last matchstick will lose the game");
        System.out.println("===============================");
        Scanner sc= new Scanner(System.in);
        while(n >= 0) {
            System.out.println("pick 1,2,3 or 4 matchsticks");
            int a = sc.nextInt();
            while(a < 1 || a > 4) {
                System.out.println("please enter a number between 1 and 4");
                a = sc.nextInt();
            }
            while(a > n) {
                System.out.println("we are left with total " + n + " matchsticks. please choose a number less than " + n);
                a = sc.nextInt();
            }
            n = n-a;
            if( n == 0) {
                System.out.println("Oops. you have lost. Better luck next time");
                break;
            }
            int b = 5-a;
            System.out.println("computer picks "+ b + " matchsticks");
            n = n-b;   
            System.out.println("number of matchsticks left = " + n);
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        func();
    }
}
