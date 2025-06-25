#include <iostream>
using namespace std;

int main() {
    float r1, i1, r2, i2, reR, imR;

    cout << "Complex number 1 (real and imaginary): ";
    cin >> r1 >> i1;

    cout << "Complex number 2 (real and imaginary): ";
    cin >> r2 >> i2;

    reR = r1 - r2;
    imR = i1 - i2;
    cout << "Subtraction: " << reR;
    if (imR >= 0)
        cout << " + " << imR << "i" << endl;
    else
        cout << " - " << -imR << "i" << endl;

    return 0;
}
