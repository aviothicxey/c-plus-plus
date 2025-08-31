// #include<iostream>
// using namespace std;
// int main(){
//     int x;
//     int factorial = 1;
//     cout<<"factorial of : ";
//     cin>> x;
//     for ( int i = 1 ; i <= x ; i++ ){
//         factorial = factorial * i ;
//     }
//     cout<< "factorial of "<< x << " is "<< factorial<< endl;
//     return 0;
// }



//Testpad : 

#include <iostream>
using namespace std;
int main(){
    int n ; 
    
    cin>>n;
    int arr[n];
    for(int i = 0 ; i <n ; i++){
        cin>>arr[i];
    }
    for(int i = 0 ; i<n; i++){
        int factorial = 1;
        for(int j = 1 ; j <= arr[i];j++){
            factorial = factorial * j;
        }
          cout <<factorial<<endl;
    }
  
    return 0;
    
}