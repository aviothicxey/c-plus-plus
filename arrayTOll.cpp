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
node*deletetail(node*head){
    if(head == NULL || head-> next == NULL) return NULL;

    node* temp = head;
    while( temp->next->next != NULL){
        temp =temp->next;
    }
    
    delete temp->next;
    temp->next = nullptr;

    return head;
}
node*deletek(node*head , int k){
    if(head == NULL) return head;
    if(k==1){
        node*temp =head;
        head = head->next;
        delete temp;
        return head;
    }
    int cnt = 0;
    node*temp = head;
    node* prev = NULL;
    while(temp != NULL){
        cnt++;
       
        if(cnt == k){
            prev->next = prev->next->next;
            delete temp;
            break;
        }
        prev = temp;
       temp = temp->next;
    }
    return head;
}
node*deleteEL(node*head , int el){
    if(head == NULL) return head;
    if(head->data == el){
        node*temp =head;
        head = head->next;
        delete temp;
        return head;
    }
    node*temp = head;
    node* prev = NULL;
    while(temp != NULL){
      
       
        if(temp->data == el){
            prev->next = prev->next->next;
            delete temp;
            break;
        }
        prev = temp;
       temp = temp->next;
    }
    return head;
}
node * insertHead(node * head , int val){
    return new node(val,head);
}
node* insertTail(node*head,int val){
    if(head == NULL) return new node(val , head);
    node*temp = head;
     while (temp->next != NULL )
     {
        temp = temp->next;
     }
     node*newnode = new node(val);
      temp->next = newnode;
    return head;
}
node * insertAtK(node*head , int val,int k){
    if(head == NULL){
        if(k==1)return new node(val);
        else return NULL;
    }
    if(k == 1){//insertion at head
        node * temp = new node(val,head);
        return temp;
    }
    node * temp = head;
    int cnt = 0 ;
    while(temp != NULL){
        cnt++;
        if(cnt == k-1){
            node * n = new node(val);
            n->next = temp->next;
            temp->next = n;
            break;
        }
        temp = temp->next;
    }
    return head;
}
node * insertBEFOREvalue(node*head , int el,int val){
    if(head == NULL){
         return NULL;
    }
    if(head->data == val){
        return new node (el, head);
    }
    node * temp = head;
    while(temp->next != NULL){
        
        if(temp->next->data == val){
            node * n = new node(el,temp->next);
            temp->next = n;
            break;
        }
        temp = temp->next;
    }
    return head;
}
int main(){
    vector<int> arr = {2,5,8,7};
    node * head = COnvertArr2LL(arr);

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
    // head = deleteHead(head);
    // print(head);
    // head = deletetail(head);
    // head = deletek(head,3);
    // head = deleteEL(head,8);
    // head = insertHead( head, 100);
    //  head = insertTail( head, 100);
    // head = insertAtK(head, 10 , 3);
    head = insertBEFOREvalue(head, 10 , 7);
    print(head);

}