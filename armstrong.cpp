
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
    int num,originalnum,n = 0, result =0;
     cout<<"enter the number:"<<endl;
  cin>>num;
    originalnum = num;
    while (originalnum!=0)
    {
        originalnum = originalnum/10;
        n++;
    }
    while (originalnum!=0)
    {
       int remainder = originalnum % 10;
        result = result + pow(remainder , n);
        originalnum = originalnum / 10;
    }
    if (result == num)
    {
        cout<<"armstrong number .";
    }
    else{
        cout<<"not armstrong.";
    }
    return 0;
    
    

    
}