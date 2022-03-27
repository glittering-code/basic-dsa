public class Main {
  public static void main(String [] args) {
    BST tree = new BST();
    //30 50 15 20 10 40 60
    tree.insert(30);
    tree.insert(50);
    tree.insert(15);
    tree.insert(20);
    tree.insert(10);
    tree.insert(40);
    tree.insert(60);
    if(tree.search(40) == true) {
      System.out.println("found 40");
    }
    if(tree.search(0) == true) {
      System.out.println("found 0");
    }
    tree.preorder();
    tree.inorder_iterative();
    //tree.postorder();
  }
}
