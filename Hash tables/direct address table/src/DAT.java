public class DAT {
  int [] arr; // arr.length 10 0-9
  DAT(int size) {
    arr = new int[size];
  }
  // 2 or 3 = O(1)
  boolean insert(int d) {
    if(d < 0 || d > arr.length-1) { // 1
      return false;
    }
    arr[d] = d; // 3 arr[3] = 3 // 1
    return true; // 1
  }
  // O(1)
  int delete(int d) {
    if(d < 0 || d > arr.length-1)
      return -1;
    int ret = arr[d];
    arr[d] = -1;
    return ret;
  }
  // O(1)
  boolean search(int d) {
    if(d < 0 || d > arr.length-1)
      return false;

     if(arr[d] == d) {
       return true;
     }
     return false;
  }
}
