// Stack is a data structure that follows the Last In First Out (LIFO) principle.
// This implementation provides basic stack operations such as push, pop, and top.
// It uses a dynamic array (vector) to store the stack elements.
// The stack supports elements of any data type using templates.
//holds a certain type of data

//queue is a data structure that follows the First In First Out (FIFO) principle.
// This implementation provides basic queue operations such as enqueue, dequeue, and front.
// It uses a dynamic array (vector) to store the queue elements.
// The queue supports elements of any data type using templates.
//holds a certain type of data



//stack using array:

#include <iostream>
#include <vector>
using namespace std;
class stack{
    int top = -1 ;
    int st[10];
    public:
    void push(int x){
        if(top >= 10){
            cout<<"stack overflow"<<endl;
            return;
        }
        top = top+1;
        st[top] = x;
    }
    int top(){
        if(top == -1){
            return -1;
        }
        return st[top];
    }
    void pop(){
        if(top == -1){
            return;
        }
        top = top-1;
    }
    int size(){
        return top + 1;
    }
};
//stack using arrays is not dynamic in nature...takes extra spaces . 

//queue using arrays:

class q{
int size = 10;
int q[10];
int curr_size= 0;
int start = -1;
int end = -1;
void push(int x){
    if(curr_size == size){

    }
    if(curr_size = 0){
        start = 0 ; end = 0 ;
    }
    else{
        end = (end+1)% size;
    }
    q[end] = x ;
    curr_size += 1;
}
void pop(){
    if(curr_size == 0){
        cout<<"q is empty";
    }
    int el = q[start]; // storing the element here...
    if(curr_size == 1){ // this will destroy the queue so make sure to store the element somewhere
        start = end = -1;
    }else{
        start = (start+1) % size;
        curr_size -= 1;
    }
    cout<<el;
}
int top(){
    if(curr_size == 0){
        return 0;
    }
    return q[start];
}
int size(){
    return curr_size;
}
};

//stack using linked list:
class Node{
    public:
    int data;
    Node*next;
    Node(int data1 , Node* next1){
        data = data1;
        next = next1;
    }
    Node(int data1){
        data = data1;
        next = NULL;
    }
};
class stack{
    Node* top = NULL;
    int size = 0;
    public:
    void push(int x){
        Node* temp = new Node(x);
        temp->next = top;
        top = temp;
        size = size + 1;
    }
    void pop(){
        Node * temp = top;
        top = top->next;
        delete temp;
        size = size -1;
    }
    int top(){
        return top->data;
    }
    int size(){
        return size;
    }
};

// queue using stack:
  