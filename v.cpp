// #include<iostream>
// #include<cmath>
// using namespace std;
// int main(){
//   int num,originalNum,result = 0 , n = 0,remainder;
//   cout<<"enter the number:"<<endl;
//   cin>>num;
//   originalNum = num;
//   while(originalNum!= 0){
//      originalNum = originalNum / 10;
//      n++;
//   }
//   originalNum = num;
//   while (originalNum!=0)
//   {
//      remainder = originalNum % 10;
//      result = result + pow(remainder,n);
//      originalNum = originalNum / 10;
//   }
//   if(num == result){
//      cout<<"number is armstrong.";
//   }
//   else{
//      cout<<"number is not armstrong.";
//   }
//   return 0;
  
// }


// #include<iostream>
// using namespace std;
// int main(){
//      int n;
//      cout<<"enter number of elements in an array:";
//      cin>>n;
//      int arr[n];
//      for(int i = 0 ; i < n ; i++ ){
//           cout<<"enter element "<<i<<" : ";
//           cin>>arr[i];
//      }
//      int target;
//      cout<<"enter the target value you need to find : ";
//      cin>>target;
//      for(int i = 0 ; i < n ; i++){
//           if(arr[i] == target){
//                cout<<"found "<<target<<" at "<< i;
//                break;
//           }
//      }
//      return 0;
// }


// #include <iostream>
// using namespace std;
// int main(){
//     int n ; 
    
//     cin>>n;
//     int arr[n];
//     for(int i = 0 ; i <n ; i++){
//         cin>>arr[i];
//     }
//     for(int i = 0 ; i<n; i++){
//         int factorial = 1;
//         for(int j = 1 ; j <= arr[i];j++){
//             factorial = factorial * j;
//         }
//           cout <<factorial<<endl;
//     }
  
//     return 0;
    
// }


// #include <iostream>
// using namespace std;

// void printWhenHundred(int i) {
//     if (i > 100) return;  

//     if (i == 100) {
//         cout << "Aparna" << endl;
//     } else {
//         printWhenHundred(i + 1);
//     }
// }

// int main() {
//     printWhenHundred(1); 
//     return 0;
// }




#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter the number of elements: ";
    cin>> n;
    int arr[n];
    for(int i = 0; i < n; i++){
        cout<< "Enter element : ";
        cin>> arr[i];
    }
    for(int i = 0 ; i <n ; i++){
        if ( arr[i] < 0 ) continue;
        cout<< arr[i]<<"\t";
    }
    
      
}