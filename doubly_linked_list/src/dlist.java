class Node {
  int data;
  Node next;
  Node(int d) {
    data = d;
    next = null;
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
      head = n;
    }
    return true;
  }
  void insertInTheEnd(int d) {
    Node n = new Node(d);

  }
}
