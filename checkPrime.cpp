/*
//USing functions:
#include <iostream>
using namespace std;
bool isPrime(int n){
    if (n<= 1 )return false;
    for(int i = 2 ; i <= n/2 ; i++){
        if (n% i == 0)return false;
    }
    return true;
}
int main(){
    int num;
    cout << "enter a number : ";
    cin >> num;
    if (isPrime(num))
    cout<< num <<"is prime";
    else
    cout<< num <<"is not prime.";
    return 0;
}
*/

//Without Function:
#include<iostream>
using namespace std;
int main(){
    int n ;
    cout<<"Enter  number:";
    cin >> n;
    if (n==2 || n == 3 || n == 5){
        cout<< n << "is prime .";
    }
    
    else if(n% 2 ==0 ||n%3 == 0 || n % 5 == 0 ){
        cout<< n <<" is not prime.";
    }
    else{
         cout<< n << "is prime .";
    }
    return 0;

}
