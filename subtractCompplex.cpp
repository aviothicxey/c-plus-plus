#include<iostream>
using namespace std;
int main(){
    float r1 ,i1 ,r2 ,i2 , reR , imR;
    cout << " Complex number 1 : "<<r1<<"+"<<i1 << "i";
    cin >> r1 >> i1 ;
    cout << "Complex number 2 : "<<r2<<"+"<<i2 << "i";
    cin>> r2 >> i2;
    reR = r1 - r2;
    imR = i1 - i2 ;
    cout << "subtraction : "<< reR <<"+" << imR ;
    return 0;

}