//Dll:
//2 pass solution: bog oh of 2n:

/*
node* temp = haed;
stack<int> st;

while(temp!= null){
st.push(temp->data);
temp = temp->next;
}

node* temp = haed;

while(temp != null){
temp->data = st.top();
st.pop();
tmp = temp->next;
}


*/



// one pass:

//use swapping:

   