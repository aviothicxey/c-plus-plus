#include <iostream>
using namespace std;

int main(){
    string ch;
    cout<<"enter a string: ";
    getline(cin,ch);
    int count =0;
    for (int i = 0;i<ch.length();i++){
        char x = tolower(ch[i]);
        if(x >='a'&& x <='z'){
            count++;
        }
    }
    cout<<"Frequency of alphabets: "<<count<<endl;
    return 0;
}