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


#include<iostream>
using namespace std;
int main(){
     int n;
     cout<<"enter number of elements in an array:";
     cin>>n;
     int arr[n];
     for(int i = 0 ; i < n ; i++ ){
          cout<<"enter element "<<i<<" : ";
          cin>>arr[i];
     }
     int target;
     cout<<"enter the target value you need to find : ";
     cin>>target;
     for(int i = 0 ; i < n ; i++){
          if(arr[i] = target){
               cout<<"found "<<target<<" at "<< i;
               break;
          }
     }
     return 0;
}