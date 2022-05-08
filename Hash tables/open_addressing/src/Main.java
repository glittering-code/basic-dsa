public class Main {
  public static void main(String args[]) {
    Hash h = new Hash(10);
    h.insert(7);
    h.insert(17);
    h.insert(27);
    h.insert(46);
    //h.delete(17);
    boolean b = h.search(27) ;
    if(b == true) {
      System.out.println("27 found");
    }
    else {
      System.out.println("27 not found");
    }

  }
}
