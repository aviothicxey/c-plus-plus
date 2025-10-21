#include <bits/stdc++.h>
using namespace std;
struct node{
    public:
    int data;
    node* next;
    public:
    node(int data1,node* next1){
        data = data1;
        next = next1;
    }
};
int main() {
    vector<int> arr = {2,5,8,7};
    node*y = new node (arr[0],nullptr);
    node x =  node (arr[0],nullptr);
    cout<<y;
   cout<< y->data <<endl;
   cout<< x.data<<endl;
   cout<< x.next<<endl; //returns nullptr
   //cout<<y.data; // throws error
    // cout<<x; // throws an error coz its an object
   
}
