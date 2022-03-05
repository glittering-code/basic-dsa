public class cqueue {
  int [] arr;
  int front;
  int rear;
  cqueue(int size) {
    arr = new int[size];
    front  = rear = -1;
  }
  //complexity = O(1)
  boolean isEmpty() {
    if(front  == -1) {
      return true;
    } else {
      return false;
    }
  }
  //complexity = O(1)
  boolean isFull() {
    if ((rear + 1) % arr.length == front) {
      return true;
    } else {
      return false;
    }
  }
  //complexity = O(1)
  boolean enqueue(int data) {
    //if(isFull())
    /*if(rear == arr.length-1) {
      rear = 0;
    } else {
      rear++;
    }*/
    if(isFull()) { // 1
      System.out.println("overflow condition. can't add " + data);
      return false;
    }
    rear = (rear+1)%(arr.length); //0 to length-1 = rear%length // 1
    if(front == -1) { // if it is first element
      front = 0;
    }
    arr[rear] = data; //1
    return true;// 1
  }
  //complexity = O(1)
  int dequeue() {
    if(isEmpty()) {
      System.out.println("underflow condition.queue is empty.");
      //System.exit(-1);
      return Integer.MIN_VALUE;
    }
    int data = arr[front]; // 1
    if(front == rear) {
      front = -1;
      rear = -1;
    } else {
      front = (front + 1) % (arr.length); //1
    }
    return data; // 1
  }
  //complexity = O(1)
  int peek() {
    if(isEmpty()) {
      System.out.println("underflow condition.queue is empty.");
      //System.exit(-1);
      return Integer.MIN_VALUE;
    }
    int temp = (front+1)% arr.length;
    int data = arr[temp];
    return data;
  }

}
