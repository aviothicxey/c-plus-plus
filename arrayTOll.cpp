#include<bits/stdc++.h>
using namespace std;
class node{
    public:
    int data;
    node* next;
    public:
    node(int data1 , node * next1){
        data = data1;
        next = next1;
    }
    public:
    node(int data1){
        data = data1;
        next = nullptr;
    }
} ;
node* COnvertArr2LL(vector <int> &arr){
    node * head = new node(arr[0]);
    node*mover = head;
    for(int i = 1; i < arr.size();i++){
        node*temp = new node(arr[i]);
        mover->next =temp;
        mover = temp;
    }
    return head;
}
int lengthOfLL(node*head){
    int cnt = 0;
    node * temp = head ;
    while(temp){
        temp = temp->next;
        cnt++;
    }
    return cnt;
}
int checkifpresent(node*head,int val){
    node*temp = head;
    while(temp){
        if(temp->data == val)return 1;
        temp = temp->next;
    }
    return 0;
}
node* deleteHead(node*head){
    if(head == NULL) return head;
    node * temp = head;
    head = head->next;
    delete temp;
    return head;
}
void print(node*head){
    while(head !=NULL){
        cout<<head->data<<" ";
        head = head->next;
    }
    cout<<endl;
}
int main(){
    vector<int> arr = {2,5,8,7};
    node * head = COnvertArr2LL(arr);
    head = deleteHead(head);
    print(head);
    // cout<<head->data;
   /*  traversal code
   node * temp = head;
    while (temp)
    {
     cout<<temp -> data <<" ";
     temp = temp->next;
    }
    */
    // cout<<lengthOfLL(head);
    // cout<< checkifpresent(head,5);
}