public class queue {
  int [] arr;
  int end;
  queue(int size) {
    arr = new int[size];
    end = -1;
  }
  //complexity = O(1)
  boolean isEmpty() {
    if(end == -1)
      return true;
    else
      return false;
  }
  //complexity = O(1)
  boolean isFull() {
    if(end == arr.length-1) {
      return true;
    } else {
      return false;
    }
  }
  //complexity = O(1)
  boolean enqueue(int data) {
    if(isFull()) {
      System.out.println("queue is full. can't enqueue " + data);
      return false;
    }
    end++;
    arr[end] = data;
    return true;
  }
  //complexity = O(n)
  int dequeue() {
    if(isEmpty()) {
      System.out.println("queue is empty. can't dequeue");
      return Integer.MIN_VALUE;
    }
    int d = arr[0];
    //shift all the elements towards left
    for(int i = 1 ; i <= end ; ++i) {
      arr[i-1] = arr[i];
    }
    end--;
    return d;
  }
  //complexity = O(1)
  int peek() {
    if(isEmpty()) {
      System.out.println("queue is empty. can't dequeue");
      return Integer.MIN_VALUE;
    }
    return arr[0];
  }
}
