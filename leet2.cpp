#include<iostream>
using namespace std;
int main(){
    int n1 , n2;
    cout <<"Enter number of elements in row 1: ";
    cin >> n1;
    int row1[100];
    for (int i = 0 ; i < n1 ; i++){
        cin >> row1[i];
    }
cout << "enter the number of elements in row 2 : ";
cin >> n2 ;
int row2 [100];
for (int j = 0 ; j < n2 ; j++){
    cin >> row2[j];
}
int result[101];
int carry = 0;
int  i = 0;
int maxlength;
if (n1>n2){
    maxlength = n1;
}
else {
    maxlength = n2;
}
while (i<maxlength){
    int digit1 = 0;
    int digit2 = 0;
    if (i < n1){
        digit1 = row1[i];
    }
    if (i < n2) {
        digit2 = row2[i];
    }
    int sum = digit1 + digit2 + carry;
    result[i] = sum % 10 ;
    carry = sum / 10;
    i++;
}
if (carry > 0){
    result[i] = carry;
    i++;
}
cout << " output: [";
    for (int j = 0; j < i; j++) {
        cout << result[j];
        if (j < i - 1) {
            cout << ", ";
        }
    }
    cout << "]" << endl;

    return 0;

}