#include <iostream>
using namespace std;
class Student{
    string name;
    int age;
    int rollNumber;
    public:
    Student(string n , int a , int r){
        name = n ;
        age = a ;
        rollNumber = r ;
    }
    void display(){
        cout << "name : "<< name << " , roll number : "<<rollNumber << " , age :  "<< age << endl; 
    }
};
int main() {
    string name;
    int roll;
    int age;
    
    cout << "Enter name: ";
    getline(cin, name);

    cout << "Enter roll: ";
    cin >> roll;
    cout<< " enter age : ";
    cin >> age;

    Student s1(name,age , roll);
    s1.display();

    return 0;
}

