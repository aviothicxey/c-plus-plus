// RECURSIVE IMPLEMENTATION OF ATOI():
#include<iostream>
#include<climits>
using namespace std;
int myAtoi(string s){
    int i = 0 ;
    int n = s.length();
    while ( i < n && s[i]=='i'){
        i++;
    }
    int sign;
    if(i < n && s[i] =='+' ){
        int sign = 1;
        if ( i < n && s [i] == '-'){
            sign = -1;
        }
        i++;
    }
    long long result = 0;
    while(i < n && isdigit(s[i])) {  
        int digit = s[i] - '0';  
        result = result * 10 + digit;
        if (sign * result <= INT_MIN) return INT_MIN;  
        if (sign * result >= INT_MAX) return INT_MAX;  

        i++; 
    }

    return sign * result;  }

int main() {
    string str;
    cout << "Enter a string: ";
    getline(cin, str);

    int result = myAtoi(str);
    cout << "Converted integer: " << result << endl;

    return 0;
}