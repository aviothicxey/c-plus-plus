//Count Digits:
#include <bits/stdc++.h>
using namespace std;
int countD(int n){
    int cnt = 0 ;
    while(n > 0){
        n = n / 10;
        cnt++;
    }
    return cnt;
}
int main() {
	
int n;
cin>>n;
cout<<countD(n)<<endl;
}

//count digits :
#include <bits/stdc++.h>
using namespace std;
int countD(int n){
  int cnt = (int)(log10(n)+1);
    return cnt;
}
int main() {
int n;
cin>>n;
cout<<countD(n)<<endl;
}