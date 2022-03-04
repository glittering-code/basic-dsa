public class Main {
  public  static void main(String [] args) {
    queue q = new queue(10);
    q.enqueue(5);
    q.enqueue(10);
    q.enqueue(4);
    q.enqueue(1);
    while(q.isEmpty() == false) {
      int data = q.dequeue();
      System.out.print(data + "\t");
    }
    System.out.println("\n");
  }
}
