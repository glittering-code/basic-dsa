public class Main {
  public static void main(String [] args) {
    Hash h = new Hash();
    h.insert(1);
    h.insert(5);
    h.insert(18);
    h.insert(100);
    h.insert(56);
    if(h.search(4) == true) {
      System.out.println("4 exists in the table");
    }
    if(h.search(56) == true) {
      System.out.println("56 exists in the table");
    }
    if(h.search(1) == true) {
      System.out.println("1 exists in the table");
    }
  }
}
