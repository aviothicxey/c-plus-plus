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
/*
input: 5
Output:
a
ab
abc
abcd
abcde 
*/


#include <iostream>
using namespace std;

int main() {
    string str;
    cout << "Enter a string: ";
    getline(cin, str);

    for (int i = 0; i < str.length(); i++) {
        for (int j = 0; j <= i; j++) {
            cout << str[j];
        }
        cout << endl;
    }

    return 0;
}

/*
Input: abcde
Output:
a
ab
abc
abcd
abcde
*/