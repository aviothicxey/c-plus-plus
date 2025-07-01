#include <iostream>
using namespace std;
class Dog {
    public:
    void bark(){
        cout << "Woof!";
    }
};
int main(){
    Dog obj;
    obj.bark();
    return 0;
}