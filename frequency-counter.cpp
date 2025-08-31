/*
//COUNT THE FREQUENCY OF ALPHABETS IN A STRING
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
    */

//COUNT FREQUENCY OF EACH ELEMENT IN AN ARRAY:
#include <iostream>
using namespace std;
int main(){
    int n;
    cout <<"Size of array:";
    cin>> n;
    int arr[n], freq[n];
    cout<<"enter "<<n<<"elements:";
    for(int i = 0; i<n;i++){
        cin>> arr[i];
        freq[i] = -1;
    }
    for ( int i = 0; i <n ; i++){
        if (freq[i]!=-1){
            continue;
        }
        int count = 1;
        for (int j = i+1;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
                freq[j]=0;
            }
        }
        freq[i]= count;
    }
    cout <<"\nFREQUENCY OF EACH ELEMENT IS:\n";
    for(int i = 0; i<n; i++){
        if (freq[i]!= 0){
            cout<< arr[i]<<" appears "<<freq[i]<<" times. \n";

        }
    }
    return 0;
}

//Write a program to count the frequency of each character in a given lowercase string. 

#include <iostream>
#include <string>
using namespace std;

int main() {
    string str;
    cout << "Enter a lowercase string: ";
    getline(cin, str);

    int freq[26] = {0};  // Array to store frequency of each character

    for (char c : str) {
        if (c >= 'a' && c <= 'z') {
            freq[c - 'a']++;
        }
    }

    cout << "\nFREQUENCY OF EACH CHARACTER IS:\n";
    for (int i = 0; i < 26; i++) {
        if (freq[i] > 0) {
            cout << char(i + 'a') << " appears " << freq[i] << " times.\n";
        }
    }

    return 0;
}