public class Main {
  public static void main(String [] args) {
    linkedList l = new linkedList();
    l.insertInTheEnd(1); //1
    l.insertInTheEnd(2); // 1 2
    l.insertInTheEnd(-1); // 1 2 -1
    l.insertInTheEnd(0); // 1 2 -1 0
    l.deleteFromBeginning(); // 2 -1 0
    l.deleteFromEnd(); // 2 -1
    l.deleteFromBeginning(); // -1
    l.insertInTheBeginning(5); // 5 -1
    l.delete(-1); // 5
    l.insertInTheBeginning(9); // 9 5
    l.insertInTheEnd(0); // 9 5 0
    l.insertInTheBeginning(8); // 8 9 5 0
    l.insert(7,9); // 8 9 7 5 0
    System.out.println("content before reverse");
    l.print();
    l.reverse();
    System.out.println("content after reverse");
    l.print();
    l.reverseUsingStack();
    System.out.println("content after re-reversal");
    l.print();
  }
}
