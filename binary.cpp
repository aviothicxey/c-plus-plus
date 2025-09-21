// let array be [3,4,6,7,9,12,16,17] here n = size is 8 and your target element is 6 find the index of 6:
#include<iostream>
#include <vector>
using namespace std;
int binary(vector<int> a ,int n , int target){
    int low =0 ;
    int high = n -1;
    // int n = a.size();
    while(low<=high){
       int mid = (low + high)/2;
       if(a[mid] == target)return mid;
      else if(target > a[mid]) low = mid + 1;
      else  high = mid -1 ;
    }
    return -1;
}
int main(){
    vector<int> a = {3,4,6,7,9,12,16,17};
    int n = a.size();
    int target = 6;
    int index = binary(a,n,target);
    if(index != -1) cout << "Element found at index: " << index << endl;
    else cout << "Element not found" << endl;
}