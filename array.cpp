/*
// Search in Array and Stop at First Match (Use break):
#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"enter number of elements in array:";
    cin>>n;
    int arr[n];
    for(int i = 0 ; i<n;i++){
        cin>>arr[i];
    }
    int target;
    cout<<"enter the number to search:";
    cin>>target;
    for (int i = 0; i < n; i++){
        if (arr[i]== target ){
            cout<< "found at index: "<< i << endl;
            break;
        }
    }
    return 0;

}
*/

// SKIP NEGATIVE NUMBERS USING CONTINUE:
#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"enter the number of elements: ";
    cin>>n;
    int arr[n];
    for (int i = 0; i < n ; i++){
        cout<<"enter elements: ";
        cin>>arr[i];
    }
    for(int i = 0 ; i < n ; i++){
        if (arr[i]< 0 ){
            continue;
        }
        cout<< arr[i]<<"\t";
    }
    
    return 0 ;
}