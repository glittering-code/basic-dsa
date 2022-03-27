import java.util.Stack;

class Node {
  int data;
  Node left;
  Node right;
//  Node parent;
  //int depth;
  Node(int d) {
    data = d;
    left = null;
    right = null;
  }
}
public class BST {
  Node root;
  BST() {
    root = null;
  }
  boolean insert(Node root, Node n) {
    if(root.data > n.data) {
      if(root.left == null) {
        root.left = n;
      } else {
        insert(root.left, n);
      }
    } else {
      if(root.right == null) {
        root.right = n;
      } else {
        insert(root.right, n);
      }
    }
    return true;
  }
  // complexity = O(n), logn
  boolean insert(int d) {
    Node n = new Node(d);
    if(root == null) {
      root = n;
      return true;
    }
    return insert(root,n);
    /*if(root.data > d) {
      insert(root.left,n);
    }*/

  }
  boolean search(int d, Node root) {
    if(root == null)
      return false;
    if(root.data == d) {
      return true;
    }
    if(root.data > d) {
      return search(d,root.left);
    } else {
      return search(d,root.right);
    }

  }
  // O(log n) n
  boolean search(int d) {
    return search(d,root);
  }
  // O(n)
  private void preorder(Node n) {
    if(n == null)
      return;
    System.out.print(n.data + "\t");
    preorder(n.left);
    preorder(n.right);
  }
  //O(n)
  void preorder() {
    preorder(root);
    System.out.println();
  }
  private void inorder(Node n) {
    if(n == null)
      return;
    inorder(n.left);
    System.out.print(n.data + "\t");
    inorder(n.right);
  }
  void inorder() {
    inorder(root);
    System.out.println();
  }
  private void postorder(Node n) {
    if(n == null)
      return;
    postorder(n.left);
    postorder(n.right);
    System.out.print(n.data + "\t");
  }
  void postorder() {
    postorder(root);
    System.out.println();
  }
  void inorder_iterative() {
      Node temp = root;
      Stack<Node> s = new Stack<>();
      while(temp != null) {
        s.add(temp);
        temp = temp.left;
      }
      while(s.isEmpty() == false) {
        Node n = s.pop();
        System.out.print(n.data + "\t");
        if(n.right != null) {
          temp = n.right;
          while(temp != null) {
            s.push(temp);
            temp = temp.left;
          }
        }
      }
  }
  Node findInorderSuccessor(Node temp) {
    Node right = temp.right;
    while(right.left != null) {
      right = right.left;
    }
    return right;
  }
  void swap(Node n1, Node n2) {
    int temp = n1.data;
    n1.data = n2.data;
    n2.data = temp;
  }
  boolean deleteNode(int d) {
    Node temp = root;
    Node parent = null;
    while(temp != null) {
      if(temp.data == d) {
        break;
      }
      if(temp.data > d) {
        parent = temp;
        temp = temp.left;
      } else {
        parent = temp;
        temp = temp.right;
      }
    }
    if(temp == null) {
      System.out.println("no such node with data" + d);
      return false;
    }
    //1st case
    if(temp.left == null && temp.right == null) { // leaf
      // parent.left = null;
      //parent.right = null;
      if(parent == null) { // it is the only node in the BST
        root = null;
      } else {
        if (temp == parent.left) {
          parent.left = null;
        } else {
          parent.right = null;
        }
      }
    } else if(temp.left == null || temp.right == null ){ // it has one child
      //parent.left = temp.left or temp.right;
      //parent.right = temp.left or temp.right;
      Node child ;
      if(temp.left == null) {
        child = temp.right;
      } else {
        child = temp.left;
      }
      //parent.left = child;
      //parent.right = child;
      if(parent == null) {
        root = child;
      } else {
        if (temp == parent.left) {
          parent.left = child;
        } else {
          parent.right = child;
        }
      }
    } else {
      Node succ = findInorderSuccessor(temp);
      // replace content of temp with successor
      swap(succ,temp);
      deleteNode(succ.data);
    }
    return true;

  }
}
