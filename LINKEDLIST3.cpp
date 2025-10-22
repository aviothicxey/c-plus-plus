//doubly linked list:
// DLL: you an go in front as well as in back 
//REPRESENTATION:
#include <bits/stdc++.h>
using namespace std;
class node{
    public:
    int data;
    node*back;
    node*next;
    public:
    node(int data1, node*next1 ,node*back1 ){
        data = data1;
        next = next1;
        back = back1;
    }
    public:
    node(int data1){
        data = data1;
        next= nullptr;
        back = nullptr;
    }
};

//convert an array to dll:
node* convert2Array(vector<int> &arr){
node*head = new node(arr[0]);
node*prev = head;
for(int i = 1 ; i <arr.size();i++){
    node*temp = new node(arr[i],nullptr,prev);
    prev->next = temp;
    prev = temp;
}
return head;
}
 void print(node*head){
    while(head != NULL){
        cout<< head->data << " ";
        head = head->next;
    }
    cout<<endl;
 }

int main(){
    vector<int> arr = {1,3,2,4};
    node*head  = convert2Array(arr);
    print(head);
    return 0;
}