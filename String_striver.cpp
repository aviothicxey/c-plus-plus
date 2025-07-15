// remove outermost paranthesis:

#include <iostream>
using namespace std;
string remove(string s){
    string result = " ";
    int depth = 0;
    for (char ch : s){
        if(ch = '('){
            if (depth > 0)result = result + ch;
            depth++;
        }else if ( ch = ')'){
            depth--;
            if (depth > 0)result = result + ch;
        }
    }
    return result;
}
int main(){
string input;
cout<< " enter valid parenthesis string : ";
cin>> input;
string output= remove(input);
cout << "After removing outermost parentheses: " << output << endl;

return 0;
}
