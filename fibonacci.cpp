#include<iostream>
using namespace std;
int main(){
    int n ;
    cout << "enter the number of terms : ";
    cin >> n ;
    int first = 0 ; int second = 1;
    int next ;
    cout << "FIBONACCI SEQUENCE : ";
    for (int i = 0 ; i< n ; i++){
        cout << first << " ";
        next = first + second ;
        first = second ;
        second = next ;
    }
    cout << endl ;
    return 0;
}