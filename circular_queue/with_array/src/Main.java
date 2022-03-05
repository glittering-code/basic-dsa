public class Main {
  public static void main(String [] args) {
    cqueue cq = new cqueue(5);
    cq.enqueue(1);
    cq.enqueue(3);
    cq.enqueue(2);
    cq.enqueue(4);
    while(cq.isEmpty() == false) {
      int data = cq.dequeue();
      System.out.print(data + "\t");
    }
    System.out.println();
    //int data = cq.dequeue();
    /*if(data == Integer.MIN_VALUE) {

    }*/
  }
}
