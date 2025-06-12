#include <iostream>
using namespace std;

int main() {
    int str;
    cout << "Enter a num: ";
    cin >> str;

    for (int i = 0; i <str; i++) {
        for (char j = 'a'; j <= 'a'+i; j++) {
            cout << j;
        }
        cout << endl;
    }

    return 0;
}