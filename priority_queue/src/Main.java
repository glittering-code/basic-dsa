public class Main {
  public static void main(String [] args) {
    pqueue pq = new pqueue(5);
    pq.enqueue(1,2);
    pq.enqueue(2,1);
    pq.enqueue(3,3);
    pq.enqueue(4,0);
    pq.enqueue(5,0);
    while(pq.isEmpty() == false) {
      int d = pq.dequeue();
      System.out.print(d + "\t");
    }
    System.out.println();
  }
}
// 4 5 2 1 3
//
