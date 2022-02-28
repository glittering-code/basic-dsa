/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//#include <stdio.h>
public class Main
{
  public static void main(String[]args)
{
    //printf("Hello World");
    //Node n1 = new Node();
    //n1.data = 3;
    //n1.next = null;
    //3 -> root
    //linkedList l = new linkedList(n1);
    linkedList l = new linkedList(null);
    l.insertInTheBeginning(7); // 7
    l.insertInTheEnd(2); // 7->2
    l.insertInTheEnd(1);
    l.insert(8,7); // insert 8 after 7
    // 7 8 2 1     
    // 7 -> 3
    l.print(); // 7
    
    {
      Node n11 = new Node();
      n11.data = 13;
      
      Node n12 = new Node();
      n12.data = 12;
      
      Node n13 = new Node();
      n13.data = 5;
    
      n11.next = n12;
      n12.next = n13;
      n13.next = null;
      
      linkedList ll = new linkedList(n11);// 13 12 5
      
      ll.insert(1,n12); // 13 12 1 5
      
      //ll.deletionInTheBeginning(); // 12 1 5
      
      //ll.deletionInTheEnd(); //  12 1 
      ll.delete(5); 
      ll.delete(n12); // 13 12 5
      Node n = ll.search(1);
      if(n == null) {
        System.out.println("node with value 1 does not exist\n");
      }
      else {
        System.out.println("node with value 1 exists\n");
      }
      ll.print();
      ll.bubbleSort();
      ll.print();
      ll.reverseUsingStack();
      ll.print();
    }
    

    //return 0;
}
}
