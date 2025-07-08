//Design a Student Class to Manage Marks
#include <iostream>
using namespace std;
class student{
    string name ;
    long long int roll;
    int marks[5];
    public:
    void input(){
       // cin.ignore(); // Important: clear leftover newline from previous input
        cout << "Enter name: ";
        getline(cin, name);  // Allows full name with spaces

        cout << "Enter roll number: ";
        cin >> roll;
        cout << "enter marks of 5 subjects: ";
        for (int i = 0 ; i < 5 ; i++){
            cin >> marks[i];
        }
    }
    float average (){
        int sum = 0;
        for (int i = 0 ; i < 5 ; i++){
            sum = sum + marks[i];
        }
        return sum / 5.0;
    }
     void display(){
        cout << "name : "<<name << ", Roll: "<<roll << ", Average : "<<average() << endl;
    }
    
};
int main(){
    student s1;
    s1.input();
    s1.display();
    return 0;
}