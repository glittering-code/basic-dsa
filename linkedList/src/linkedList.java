import java.io.*;
import java.util.*;
class Node
{
  public int data;
  Node next;
  Node(int d) { data = d;}
}

public class linkedList {
  Node head;
  linkedList() {}
  //complexity = O(n)
  Node search(int d) {
    Node temp = head;
    while(temp != null) {
      if(temp.data == d)
        return temp;
      temp = temp.next;
    }
    return null;
  }
  //complexity = O(1)
  void insertInTheBeginning(int data) {
    Node n = new Node(data);
    if(head == null) {
      head = n;
    } else {
      n.next = head;
      head = n;
    }
  }
  //complexity = O(n)
  void insertInTheEnd(int data) {
    Node n = new Node(data);
    if(head == null) {
      head = n;
      return;
    }
    Node temp = head;
    //reach to the last node
    while(temp.next != null) {
      temp = temp.next;
    }
    temp.next = n;
  }
  //complexity = O(1)
  void insert(int data, Node m) { // insert data after node m
    if(m == null) {
      System.out.println("please pass a non-null node in 2nd argument");
      return;
    }
    Node n = new Node(data);
    Node oldNext = m.next;
    m.next = n;
    n.next = oldNext;
  }
  // complexity = O(n)
  void insert(int data, int after) {// insert data after node 'after'
    Node m = search(after);
    if(m == null) {
      System.out.println("could not find node. hence exiting from function");
      return;
    }
    insert(data,m);
  }
  //complexity = O(1)
  int deleteFromBeginning() {
    if(head == null) {
      System.out.println("nothing to be deleted. linked list is empty");
      return Integer.MIN_VALUE;
    }
    Node next = head.next;
    int d = head.data;
    head = next;
    return d;
  }
  //complexity = O(n)
  int deleteFromEnd() {
    if(head == null) {
      System.out.println("nothing to be deleted. linked list is empty");
      return Integer.MIN_VALUE;
    }
    Node temp = head;
    Node prev = null;
    //reach to the last node
    while(temp.next != null) {
      prev = temp;
      temp = temp.next;
    }
    //2nd last node in prev
    // last node in temp
    if(prev == null) { // only one node in linked list
      head = null;
    } else {
      prev.next = null;
    }
    return temp.data;
  }
  //complexity = O(1)
  int deleteNextNode(Node m) { // delete node adjacent to m
    if(m == null) {
      System.out.println("please pass a non-null node as argunment to deleteAfter function");
      return Integer.MIN_VALUE;
    }
    Node node = m.next; // node to be deleted
    if(node == null) {
      System.out.println("it is last node in linkedList. Hence returning from function");
      return Integer.MIN_VALUE;
    }
    m.next = node.next;
    return node.data;
  }
  //complexity = O(1)
  int delete(Node m) { // delete Node m
    // this code swaps content of node m and adjacent node
    // then it deletes node next to m
    if(m == null) {
      System.out.println("please pass a non-null node as argunment to delete function");
      return Integer.MIN_VALUE;
    }

    Node next = m.next;
    int temp = m.data;
    if(next == null) {
      System.out.println("this function can't remove last node. use deleteNodeVersion2");
      return Integer.MIN_VALUE;
    }
    m.data = next.data;
    next.data = temp;
    return deleteNextNode(m);
  }
  //complexity = O(n)
  public int deleteNodeVersion2(Node nd) {
    Node temp = head;
    Node prev = null;
    while(temp != null && temp != nd) {
      prev = temp;
      temp = temp.next;
    }
    if(temp == null) { // ideally it should never happen
      System.out.println("node do not exist in linked list");
      return Integer.MIN_VALUE;
    }
    return deleteNextNode(prev);
  }
  //complexity = O(n)
  public int delete(int data) {
    Node n = search(data);
    if(n == null) {
      System.out.println("couldn't find node with given data. hence exiting from delete function");
      return Integer.MIN_VALUE;
    }
    return deleteNodeVersion2(n);
  }
  //complexity = O(n)
  public  int count() {
    Node temp = head;
    int result = 0;
    while(temp != null) {
      result++;
    }
    return  result;
  }
  //complexity = O(3n/2) = O(n)
  public Node findMiddle_native() {
    int count = count();
    Node temp = head;
    for(int i = 0 ; i < count/2 ; ++i) {
      temp = temp.next;
    }
    return temp;
  }
  //complexity = O(n/2) = O(n)
  public Node findMiddle() {
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
  //complexity = O(1)
  public void swap(Node node1, Node node2) {
    if(node1 == null || node2 == null) {
      System.out.println("please pass non-null Nodes to swap function."+
        " Hence returning from swap function");
      return;
    }
    int temp = node2.data;
    node2.data = node1.data;
    node1.data = temp;
  }
  //complexity = O(n^2)
  public void bubbleSort() {
    Node temp = head;
    while(temp != null) {
      Node temp1 = head;
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
  //complexity = O(n), space complexity = O(n)
  public void reverseUsingStack() {
    Stack<Node> s = new Stack<Node>();
    Node temp = head;
    while(temp != null) {
      s.push(temp);
      temp = temp.next;
    }
    head = s.peek();
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
  //complexity = O(n)
  public Node reverse() {
    Node temp = head;
    Node prev = null;
    while(temp != null) {
      Node next = temp.next;
      temp.next = prev;
      prev = temp;
      temp = next;
    }
    head = prev;
    return prev;
  }
  //complexity = O(1)
  public int firstNode() {
    if(head == null) {
      System.out.println("linked list is empty");
      return  Integer.MIN_VALUE;
    }
    return head.data;
  }
  //complexity = O(1)
  public boolean isEmpty() {
    if(head == null)
      return true;
    else
      return false;
  }
  //complexity = O(n)
  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "\t");
      temp = temp.next;
    }
    System.out.println("\n");
  }
}