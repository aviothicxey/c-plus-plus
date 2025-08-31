//trailing zeroes of a factorial of a number:
#include <iostream>
using namespace std;
int trailingZeroes(int n) {
    int count = 0;
    while (n >= 5) {
        n /= 5;
        count += n;
    }
    return count;
}
int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;
    cout << "trailing Zero: " << trailingZeroes(n) << endl;
    return 0;
}
