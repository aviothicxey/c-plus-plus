#include<iostream>
using namespace std;
int main(){
    int x;
    int factorial = 1;
    cout<<"factorial of : ";
    cin>> x;
    for ( int i = 1 ; i <= x ; i++ ){
        factorial = factorial * i ;
    }
    cout<< "factorial of "<< x << " is "<< factorial<< endl;
    return 0;
}