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
    double A = 0.618;
    double temp = (d*A)%1;
    temp = temp*arr.length;
    //temp =temp;
    int ret =  (int)(Math.floor(temp));  // 0 to len-1
    System.out.println("location for element " + d + " is " + ret);
    return ret;
  }
  // O(1)
  boolean insert(int d) {
    int loc = hash(d); //1
    if(loc < 0 || loc > arr.length-1) //1
      return false;
    if(arr[loc] == null) {
      arr[loc] = new LinkedList<>(); //1
    }
    arr[loc].addFirst(d); // 1
    return true;
  }
// O(alpha)
  boolean delete(int d) {
    int loc = hash(d);
    if(loc < 0 || loc > arr.length-1)
      return false;
    LinkedList<Integer> l = arr[loc];

    l.remove((Integer)d);
    return true;
  }
// O(n)
  boolean search(int d) {
    int loc = hash(d); // 1
    if(loc < 0 || loc > arr.length-1 ) //1
      return false;
    LinkedList<Integer> l = arr[loc]; // 1
    if(l == null) //1
      return false;
    if(l.contains(d) == true)// n
      return true;
    return false;
  }
}
