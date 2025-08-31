#include<iostream>
using namespace std;
class Complex{
    private:
    int real , img;
    public:
    Complex(int r = 0 , int i = 0 ){
        real = r ;
         img = i ;
    }
    Complex operator+(Complex comst & obj){
        Complex res;
        res.real = real + obj.real;
    }
};