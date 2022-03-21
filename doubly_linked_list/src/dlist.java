class Node {
  int data;
  Node next;
  Node prev;
  Node(int d) {
    data = d;
    next = null;
    prev = null;
  }
}
public class dlist {
  Node head;
  Node tail;
  dlist() {
    head = null;
    tail = null;
  }
  // complexity = O(1)
  boolean insertInTheBeginning(int d) {
    Node n = new Node(d);
    if(head == null) {
      head = n;
      tail = n;
    } else {
      n.next = head;
      head.prev = n;
      head = n;
    }
    return true;
  }
  // complexity = O(1)
  boolean insertInTheEnd(int d) {
    Node n = new Node(d);
    if(tail == null) {
      head = n;
      tail = n;
    } else {
      tail.next = n;
      n.prev = tail;
      tail = n;
    }
    return true;
  }
  // complexity = O(1)
  // insert node with data d after node m
  boolean insertAfter(int d, Node m) {
    if(m == null) {
      System.out.println("please pass a non-null Node to 2nd argument of insert function");
      return false;
    }
    Node n = new Node(d);
    Node next = m.next;
    m.next = n;
    n.prev = m;
    if(next != null) { // if m is not last node
      next.prev = n;
      n.next = next;
    } else { // if m is last node
      tail = n;
    }
    return true;
  }
  // complexity = O(1)
  boolean insertBefore(int d, Node m) {
    if(m == null) {
      System.out.println("please pass a non-null Node to 2nd argument of insert function");
      return false;
    }
    Node n = new Node(d);
    Node prev = m.prev;
    n.next = m;
    m.prev = n;
    if(prev != null) { //if m is not first node
      prev.next = n;
      n.prev = prev;
    } else { //if m is first node
      head = n;
    }
    return true;
  }
  // complexity = O(n/2) = O(n)
  Node search(int d) {
    Node fwd = head;
    Node bkwd = tail;
    while(fwd != null && bkwd != null) {
      if(fwd.data == d) {
        return fwd;
      }
      if(bkwd.data == d){
        return bkwd;
      }
      if(fwd == bkwd)
        return null;
      fwd = fwd.next;
      bkwd = bkwd.prev;
    }
    return null;
  }
  // complexity = O(1)
  boolean insertAfter(int d, int d1) {
    Node srch = search(d);
    if(srch == null) {
      System.out.println("couldn't find node with data " + d1
      + " hence exiting from function insertAfter");
      return false;
    }
    insertAfter(d,srch);
    return true;
  }
  // complexity = O(1)
  boolean insertBefore(int d, int d1) {
    Node srch = search(d);
    if(srch == null) {
      System.out.println("couldn't find node with data " + d1
        + " hence exiting from function insertBefore");
      return false;
    }
    insertBefore(d,srch);
    return true;
  }
  // complexity = O(1)
  int delete(Node m) {
    if(m == null) {
      System.out.println("please pass a non-null argument to "+
        "delete function");
      return Integer.MIN_VALUE;
    }
    int ret = m.data;
    Node prev = m.prev;
    Node next = m.next;
    /*if(prev == null && next == null) {
      head = tail = null;
      return ret;
    }*/
    if(prev == null) {
      head = next;
    } else {
      prev.next = next;
    }
    if(next == null) {
     tail = prev;
    } else {
      next.prev = prev;
    }
    return ret;
  }
  // complexity = O(n)
  void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "\t");
      temp = temp.next;
    }
    System.out.println();
  }
  // complexity = O(n)
  void printReverse() {
    Node temp = tail;
    while(temp != null) {
      System.out.print(temp.data + "\t");
      temp = temp.prev;
    }
    System.out.println();
  }
  void reverse() {
    Node temp = head;
    while(temp != null) {
      Node prev = temp.prev;
      Node next = temp.next;
      temp.prev = next;
      temp.next = prev;
    }
  }

}
