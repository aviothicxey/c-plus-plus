#include<iostream>
using namespace std;
int main(){
    string ch;
    cout<<"enter a string: ";
    getline(cin,ch);
    int count =0;
    for (int i = 0;i<ch.length();i++){
        char x = tolower(ch[i]); // Convert character to lowercase for case-insensitive comparison
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
            count++;
        }
    }
cout<<count<<endl;
return 0;
}