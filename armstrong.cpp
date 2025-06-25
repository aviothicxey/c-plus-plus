#include <iostream>
using namespace std;
int main(){
    int num;
    int original;
    int rem;
    int sum = 0;
    cout << "enter a number : ";
    cin >> num;
    while(num != 0){
        rem = num % 10;
        sum = sum + (rem * rem * rem);
        num = num / 10 ;
    }
    if ( sum == original){
        cout << original << "armstrong number";
    }
    else{
        cout << original << "is not armstrong number ";
    }
    return 0;
}