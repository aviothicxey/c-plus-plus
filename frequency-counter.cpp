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