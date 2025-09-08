#include <bits/stdc++.h>
using namespace std;

void selection(vector<int>&a){
    int n = a.size();
    for (int i = 0 ; i < n - 1 ; i++){
        int mini = i;
        for(int j = i + 1 ; j < n; j++ ){
            if(a[j]<a[mini]){
                mini = j;
            }
        }
        int temp = a[i];
        a[i] =a[ mini];
       a[ mini]= temp;
    }
}

int main() {
	// your code goes here
	vector<int> a = {64, 25, 12, 22, 11};
    selection(a);
    cout << "Sorted array: ";
    for (int x : a) cout << x << " ";
    return 0;

}
