import java.io.*;
import java.util.*;
class Node
{
  public int data;
  Node next;
}

public class linkedList {
  Node root;
  linkedList(Node r) {root = r;}
  
  public void insertInTheBeginning(int d) {
    Node n = new Node(); // 1
    n.data = d; // 1
    n.next = root; // 1
    root = n; // 1
    // total 4 steps
  }
  //! 5 
  public void insert(int d, Node temp) {
    Node n = new Node(); // 1
    n.data = d; // 1
    
    Node oldNext = temp.next; // 1
    temp.next = n; // 1
    n.next = oldNext; // 1
  }
  //! 
  public void insert(int d, int after) {
    Node temp = root; // 1
    while(temp != null) { // n
      if(temp.data == after) {
        break;
      }
      temp = temp.next;
    }
    if(temp == null) { // search not successful
      insertInTheEnd(d); // n
    } else {
      insert(d, temp); // 1
    }
    // 2n + 1 or n+2 = O(n)
  }
  public void insertInTheEnd(int d) {
    Node n = new Node(); // 1
    n.data = d; // 1
    
    // reach to the last Node
    Node temp = root; // 1
    while(temp.next != null) { // n - 1
      temp = temp.next;
    }
    
    temp.next = n; // 1
    n.next = null; // 1
    // n + 2 = n
  }
  
  public void deletionInTheBeginning() {
    Node next = root.next; // 1
    root.next = null; // 1
    root = next; // 1
    // total = 3 steps = O(1)
  }
  public void deletionInTheEnd() {
   Node temp = root; // 1
   Node prev = null; // 1
   while(temp.next != null) {// n-1
     prev = temp; // n-1
     temp = temp.next; // n-1
   }
   prev.next = null; // 1
   // total = 3(n-1) + 3 = 3n = O(n)
  }
  
  public void delete(Node n) {
    
    Node ne = n.next; // ne = null 1
    
    if(ne == null) {// if n is the last node 1
      return; // 1
    }
    Node nextToNext = ne.next; // 1
    n.next = nextToNext; // 1
    ne.next = null; // 1
    // total = 5 or 2 O(1)
  }
  
  public void delete(int d) {
    Node temp = root; // 1
    while(temp != null) { // n
      if(temp.data == d) {
        break;
      }
      temp = temp.next;
    }
    if(temp != null) { // 1
      delete(temp); // 1
    }
    //total = n+3 = O(n)
  }
  public Node search(int d) {
    Node temp = root;
    while(temp != null) {
      if(temp.data == d) {
        return temp;
        //return true;
      }
      temp = temp.next;
    }
    return null;
    //return false;
  }
  //! traversal
  public void print() {
    Node temp = root;
    System.out.println("linked list content :");
    while(temp != null) {
      System.out.print(temp.data + "\t");
      temp = temp.next;
    }
    System.out.println("");
  }
  public void swap(Node node1, Node node2) {
    int temp = node2.data;
    node2.data = node1.data;
    node1.data = temp;
  }
  /*
  public static void BubbleSort(int arr[]) {
        int len = arr.length;
        for(int i = 0 ; i < len-1 ; ++i) {
            for(int j = 0 ; j < len-1 ; ++j) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                    
            }
        }
  }*/
  public void bubbleSort() {
    Node temp = root;
    while(temp != null) {
      Node temp1 = root;
      while(temp1.next != null) {
        if(temp1.data > temp1.next.data) {
          swap(temp1,temp1.next);
        }
        temp1 = temp1.next;
      }
      temp = temp.next;
      
    }
  }
  // using Stack
  // using recursion
  // using loop
  //a->b->c
  // a b c 
  // c b a
  
  public void reverseUsingStack() {
    Stack<Node> s = new Stack<Node>();
    Node temp = root;
    while(temp != null) {
      s.push(temp);
      temp = temp.next;
    }
    root = s.peek();
    Node prev = null;
    while(s.empty() == false ) {
      Node t = s.pop(); 
      t.next = null; //
      if(prev != null) {
        prev.next =  t; 
      }
      prev = t;
    }
  }
}