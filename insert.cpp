#include <bits/stdc++.h>
using namespace std;

void insertion_sort(vector<int>& arr, int n) {
    for (int i = 1; i < n; i++) {
        int temp = arr[i];
        int j;

        for (j = i - 1; j >= 0; j--) {
            if (arr[j] > temp) {
                arr[j + 1] = arr[j]; 
            } else {
                break;  
            }
        }

        arr[j + 1] = temp;  
    }
}

int main() {
    vector<int> arr = {12, 11, 13, 5, 6};
    int n = arr.size();

    insertion_sort(arr, n);

    cout << "Sorted array: ";
    for (int x : arr) {
        cout << x << " ";
    }
    return 0;
}
