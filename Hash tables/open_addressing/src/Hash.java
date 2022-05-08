public class Hash {
  int [] arr; // open addressing

  Hash(int size) {
      arr = new int[size];
      for(int i = 0 ; i < size ; ++i ) {
        arr[i] = Integer.MIN_VALUE; // empty slot
      }
  }
  int hashDash(int key) {
    return key%arr.length;
  }
  int hash(int key, int i) {
      // linear probing
    // a = 1, b = 1
    // (hashDash(key) + a*i + b*i*i)%arr.length;
    //
    return (hashDash(key) + i)%arr.length;
  }
  //O(n)
  boolean insert(int data) {
    for(int i = 0 ; i < arr.length  ; ++i) {
      int loc = hash(data, i); // i =0,1,2
      if(arr[loc] == Integer.MIN_VALUE || arr[loc] == Integer.MAX_VALUE) {
        System.out.println(data + "placed at location number " + loc);
        arr[loc] = data;
        return true;
      }
    }
    return false;
  }
  // O(n)
  boolean delete(int data) {
    for(int i = 0 ; i < arr.length  ; ++i) {
      int loc = hash(data, i); // i =0,1,2
      if(arr[loc] == data) {
        arr[loc] = Integer.MAX_VALUE; // deleted slot
        return true;
      }
      if(arr[loc] == Integer.MIN_VALUE)
        return false;
    }
    return false;
  }
  //O(n)
  boolean search(int data) {
    for(int i = 0 ; i < arr.length  ; ++i) {
      int loc = hash(data, i); // i =0,1,2
      if(arr[loc] == data)
        return true;
      if(arr[loc] == Integer.MIN_VALUE)
        return false;
    }
    return false;
  }
}
