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
}
