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
    vector <int> st[10];
    public:
    void push(int data){
        if(top >= 10){
            top = top+1;
            st[top] = data;
        }
    }
};