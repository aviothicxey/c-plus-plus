// Q1: Implement a BankAccount Class
#include <iostream>
using namespace std;
class bankaccount{
    string name ;
    int accountNumber;
    float balance ;
    public :
    bankaccount(string n, int accNo , float bal){
        name = n;
        accountNumber = accNo;
        balance = bal;
    }
    void deposit (float amount){
        balance = balance + amount;
        cout << "deposited : "<< amount <<", new balance : "<<balance << endl;
    }
    void withdraw(float amount){
        if(amount<= balance){
            balance = balance - amount;
            cout<< "withdraw: "<<amount <<", Remaining Balance : "<< balance<< endl;
        }else{
            cout<<"insufficient amount."<<endl;
        }
    }

void display(){
    cout << "name : "<<name<<"\n account number : "<< accountNumber<<"\n balance :"<< balance << endl;
}
    };
    int main(){
        bankaccount b1("aparna",1001,5000);
    b1.display();
    b1.deposit(2000);
    b1.withdraw(3000);
    b1.display();
return 0;
    };
