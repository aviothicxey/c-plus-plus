#include<iostream>
using namespace std;
class Calculator{
 public:
float add(float a , float b){return a + b ;}
float sub(float a , float b){return a - b;}
float mul(float a , float b){return a * b ;}
float divide(float a , float b){
    if ( b != 0) return a/b ;
    else{
        cout << "division by zero is not undefined .";
        return 0;
    }
}
};
int main (){
    Calculator calc;
    float x , y;
    char op;
    cout << " enter expression , eg ( 5 + 6 ) : ";
    cin >> x >> op >> y;
    switch(op){
        case '+':cout << calc.add(x, y); break;
        case '-': cout << calc.sub(x, y); break;
        case '*': cout << calc.mul(x, y); break;
        case '/': cout << calc.divide(x, y); break;
        default: cout << "Invalid operator!"; 
    }
    return 0;
}