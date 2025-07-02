//count numver of digits in a number
#include<iostream>
using namespace std;
int main(){
    int num;
    cout<<"enter a number: ";
    cin>>num;
    int count = 0;
    while(num!=0){
        num= num/10;
        count++;
    }
    cout<<"number of digits: "<<count<<endl;
    return 0;
}