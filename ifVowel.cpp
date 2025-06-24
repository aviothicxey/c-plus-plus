#include <iostream>
using namespace std;

char ifVowel(char ch) {
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        return 'v'; 
    } else {
        return 'c'; 
    }
}

int main() {
    char chr;
    cout << "Enter the letter: ";
    cin >> chr;

    char y = ifVowel(chr);

    if (y == 'v') {
        cout << "This is a vowel." << endl;
    } else {
        cout << "This is a consonant." << endl;
    }

    return 0;
}

// OR:
/*
#include <iostream>
using namespace std;

void ifVowel(char ch) {
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        cout << "This is a vowel." << endl;
    } else {
        cout << "This is a consonant." << endl;
    }
}

int main() {
    char chr;
    cout << "Enter the letter: ";
    cin >> chr;

    ifVowel(chr);

    return 0;
}

*/