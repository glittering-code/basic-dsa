 class item {
  int data;
  int priority;
  item(int d, int p) {
    data = d;
    priority = p;
  }
}
/* i1 - 1
 i2 - 2
 i3 - 3
 i4 - 0

 */
public class pqueue {
  item [] items; // int [] data;
  int end;
  // O(1)
  pqueue(int size) {
    items = new item[size];
    end = -1;
  }
  //O(1)
  boolean isEmpty() {
    if(end == -1)
      return true;
    else
      return false;
  }
  //O(1)
  boolean isFull() {
    if(end == items.length-1) {
      return true;
    } else {
      return false;
    }
  }
  //O(1)
  boolean enqueue(int data, int p) {
    if(isFull()) { // 1
      System.out.println("overflow condition. can't add data item "+ data);
      return false;
    }
    item i = new item(data,p);
    end++;
    items[end] = i;
    return true;
  }
// 1 3 5 2 0 8 9
 // lowest = 0
 //O(2n) = O(n)
  int dequeue() {
    if(isEmpty()) {
      System.out.println("underflow condition. queue is empty.can't dequeue");
      return Integer.MIN_VALUE;
    }
    int lowest_val = Integer.MAX_VALUE;
    int idx = -1;
    //n
    for(int i = 0 ; i <= end ; ++i) {
      int p = items[i].priority;
      if(p < lowest_val) {
        lowest_val = p;
        idx = i;
      }
    }
    // 1 2 3 4 5

    int ret = items[idx].data;
    //n
    for(int i = idx + 1 ; i <= end ; ++i) {
      items[i-1] = items[i];
    }
    end--;
    return ret;
  }
  //O(n)
  int peek() {
    if(isEmpty()) {
      System.out.println("underflow condition. queue is empty.can't dequeue");
      return Integer.MIN_VALUE;
    }
    int lowest_val = Integer.MAX_VALUE;
    int idx = -1;
    for(int i = 0 ; i <= end ; ++i) {
      int p = items[i].priority;
      if(p < lowest_val) {
        lowest_val = p;
        idx = i;
      }
    }
    //end--;
    return items[idx].data ;
  }
}
