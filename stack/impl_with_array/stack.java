public class stack {
    int [] arr;
    int top;
    stack(int size) {
        arr = new int[size];
        top = -1;
    }
    // 2 = O(1)
    boolean isEmpty() {
       if(top == -1) // 1
            return true; // 1
       return false; //1 
    }
    //O(1)
    boolean isFull() {
        if(arr.length-1 == top) // 2
            return true; // 1
        return false; // 1
    }
    //O(1)
    boolean push(int data) { 
        if(isFull()) { // O(1)
            System.out.println("stack is full. can't push "+data);
            return false;
        }
        top++;// top = 5
        arr[top] = data; // 0-4
        return true;
    }
    //O(1)
    int pop() {
        if(isEmpty()) {
            System.out.println("empty stack. can't pop element");
            System.exit(-1);
        }
        int item = arr[top]; // arr[-1]
        top--;
        return item;
    }
    //O(1)
    int top() {
        if(isEmpty()) {
            System.out.println("empty stack. can't find top element");
            System.exit(-1);
        }
        int item = arr[top];
        //top--;
        return item;
    }
}