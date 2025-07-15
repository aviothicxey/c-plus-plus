
//display armstrong number between two intervals


#include <iostream>
#include <cmath>
using namespace std;

// Function to check if a number is Armstrong
bool isArmstrong(int num) {
    int original = num;
    int sum = 0;
    int digits = 0;
    int temp = num;

    // Count number of digits
    while (temp != 0) {
        temp /= 10;
        digits++;
    }

    temp = num;
    while (temp != 0) {
        int digit = temp % 10;
        sum += pow(digit, digits);
        temp /= 10;
    }

    return sum == original;
}

int main() {
    int low, high;
    cout << "Enter lower limit: ";
    cin >> low;
    cout << "Enter upper limit: ";
    cin >> high;

    cout << "Armstrong numbers between " << low << " and " << high << " are:\n";
    for (int i = low; i <= high; i++) {
        if (isArmstrong(i)) {
            cout << i << " ";
        }
    }

    cout << endl;
    return 0;
}


//armstrong number:

#include<iostream>
#include<cmath>
using namespace std;
int main(){
  int num,originalNum,result = 0 , n = 0,remainder;
  cout<<"enter the number:"<<endl;
  cin>>num;
  originalNum = num;
  while(originalNum!= 0){
     originalNum = originalNum / 10;
     n++;
  }
  originalNum = num;
  while (originalNum!=0)
  {
     remainder = originalNum % 10;
     result = result + pow(remainder,n);
     originalNum = originalNum / 10;
  }
  if(num == result){
     cout<<"number is armstrong.";
  }
  else{
     cout<<"number is not armstrong.";
  }
  return 0;
  
}
