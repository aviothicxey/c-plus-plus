#include<iostream>
using namespace std;
class calculator{
    public: 
    int x , y;
int sum(){
    return x + y;
}
void operator - (calculator & instance){
    int p = this ->x; //C1
    int q = instance.x; //C2
    cout<< q - p<<endl;
}
};
int main(){
    calculator C1,C2;
    C1.x = 3 ;
     C2.x = 12 ;
     C1.y = 5;
     C1 - C2;
     cout<< C1.sum();
     return 0;
}
