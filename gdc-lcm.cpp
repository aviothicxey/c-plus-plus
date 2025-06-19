#include<iostream>
using namespace std;
int findGDC(int a , int b ){
    while(b!= 0){
        int temp = b ;
        b = a % b ;
        a = temp;
    }
    return a;
}
int findLCM(int a , int b){
    return(a * b)/ findGDC(a,b);

}
int main(){
    int num1 , num2;
    cout<< "enter two numbers: ";
    cin >> num1 >> num2;
    int lcm = findLCM(num1,num2);
    cout<<"LCM of "<< num1<<"&"<< num2 << "is "<< lcm;
    return 0;
}