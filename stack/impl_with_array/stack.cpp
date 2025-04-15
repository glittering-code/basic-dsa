// Online C++ compiler to run C++ program online
#include <iostream>
#include <climits>
const int max_size = 1024;
using namespace std;
class stack {
    int size;
    int top;
    int data[max_size];
  public :
  stack(int s) {
      size = s;
      top = 0;
  }
  bool isEmpty() {
      if(top == 0)
        return true;
    else
        return false;
  }
  bool isFull() {
    if(top == size)
        return true;
    else
        return false;
  }
  bool push(int d) {
      if(isFull() == true) {
          cout<<"overflow"<<endl;
        return false;
      }
      data[top] = d;
      top++;
      return true;
  }
  int pop() {
      if(isEmpty() == true){
          cout<<"underflow"<<endl;
          return INT_MAX;
      } else {
          top--;
          return data[top];
      }
  }
  void print() {
      for(int i = top-1; i >=0 ; i--) {
          cout<<data[i]<<"\t";
      }
      cout<<endl;
      
  }
  
};
int main() {
    stack s(5); // stack of size 5
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    s.print(); 
    s.push(69); 
    cout<<s.pop()<<endl;
    cout<<s.pop()<<endl;
    s.push(89);
    s.print(); 
   
    return 0;
}
