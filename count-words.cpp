#include<iostream>
using namespace std;
int main(){
    string str;
    int wordcount =1 ;
    cout<<"enter a sentence: ";
    getline(cin,str);
    for(int i = 0; i< str.length();i++){
        if (str[i]== ' '&& str[i+1]!= ' '){
            wordcount++;
        }
    }
    cout<<"wordcount:"<<wordcount<<endl;
    return 0;
}

