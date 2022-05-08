import java.util.LinkedList;
// int and Integer
// object -> integer, character, floating
public class Hash {
  // int arr[];
  LinkedList<Integer> arr[];
  Hash() {
    // 32 and 64
     arr = new LinkedList[53];
  }
  int hash(int d) {
    // division method
    return d%(arr.length); // 0 to len-1
  }
  boolean insert(int d) {
    int loc = hash(d);
    if(loc < 0 || loc > arr.length-1)
      return false;
    if(arr[loc] == null) {
      arr[loc] = new LinkedList<>();
    }
    arr[loc].addFirst(d);
    return true;
  }

  boolean delete(int d) {
    int loc = hash(d);
    if(loc < 0 || loc > arr.length-1)
      return false;
    LinkedList<Integer> l = arr[loc];
    l.remove(d);
    return true;
  }

  boolean search(int d) {
    int loc = hash(d);
    if(loc < 0 || loc > arr.length-1 )
      return false;
    LinkedList<Integer> l = arr[loc];
    if(l == null)
      return false;
    if(l.contains(d) == true)
      return true;
    return false;
  }
}
