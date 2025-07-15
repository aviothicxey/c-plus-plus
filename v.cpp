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
