#include <iostream>
using namespace std;
int main(){
    int n ;
    cin >> n;
    int arr[n];
    for (int i = 0; i <= n; i++){
        cout<<"element "<< i << "=" <<"\n";
        cin >> arr[i];
    }
    int target ;
    cin >> target;
    for ( int i = 0 ; i < n ; i++){
        for (int j = i+ 1 ; j < n ; j++ ){  // j starts from i+1 to avoid repeating and self-sum
            if ( arr[i] + arr[j] == target){  
            cout<<"["<<i << ", " << j << "]";
            return 0;
            }
        }
    }
    return 0;
}