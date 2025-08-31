//bank employee salary : classes

#include<iostream>
using namespace std;
class Employee{
    private:
    string name;
    int employeeId;
    long long int salary;

    public:
    void details(string n , int id, int sal){
        name = n;
        employeeId = id;
        salary = sal;
    }
    void calculate(char grade){
        if(grade == 'A'){
            salary += salary * 0.50;
        } else if (grade == 'B') {
            salary += salary * 0.30;
        } else if (grade == 'C') {
            salary += salary * 0.10;
        } else {
            cout << "Invalid grade entered. No bonus applied.\n";
        }
    }

    void displaySalary() {
        cout << "Final Salary: " << salary << endl;
    }
};

int main() {
    string name;
    int id;
    double baseSalary;
    char grade;

    // Input
    cout << "Enter employee's name: ";
    getline(cin, name);
    cout << "Enter employee ID: ";
    cin >> id;
    cout << "Enter base salary: ";
    cin >> baseSalary;
    cout << "Enter performance grade (A/B/C): ";
    cin >> grade;
    Employee emp;
    emp.details(name, id, baseSalary);
    emp.calculate(grade);
    emp.displaySalary();

    return 0;
}

