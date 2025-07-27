// #include<iostream>
// using namespace std;
// int main(){
//     int n ;
//     cout << "enter the number of terms : ";
//     cin >> n ;
//     int first = 0 ; int second = 1;
//     int next ;
//     cout << "FIBONACCI SEQUENCE : ";
//     for (int i = 0 ; i< n ; i++){
//         cout << first << " ";
//         next = first + second ;
//         first = second ;
//         second = next ;
//     }
//     cout << endl ;
//     return 0;
// }


//FIBBONACCI USING CLASSES:

#include <iostream>
using namespace std;
class fibo{
    public:
    int fibbonaaci(int n){
        if (n == 0)return 0;
        if (n == 1 )return 1;
        return fibbonaaci(n-1) + fibbonaaci(n-2);
    }
};
int main(){
    fibo fib;
    int n ;
    cin >> n;
    int result = fib.fibbonaaci(n);
    cout<<result;
    return 0;
}