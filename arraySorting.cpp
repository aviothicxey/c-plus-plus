// CHECK IF ARRAY IS SORTED:
// #include <iostream>
// using namespace std;
// int main() {
//     int arr[] = {1, 2, 3, 4, 5};
//     int n = sizeof(arr) / sizeof(arr[0]);
//     bool isSorted = true;

//     for (int i = 1; i < n; i++) {
//         if (arr[i] < arr[i - 1]) {
//             isSorted = false;
//             break;
//         }
//     }

//     if (isSorted) {
//         cout << "Array is sorted." << endl;
//     } else {
//         cout << "Array is not sorted." << endl;
//     }

//     return 0;
// }
//
#include <iostream>
using namespace std;
int main(){
    bool isSorted = true;
    int arr[100];
    for(int i = 0; i < 100; i++){
       cin >> arr[i]; 
    }
    int n = sizeof(arr) / sizeof(arr[0]);
    for (int i = 1; i < n; i++) {
        if (arr[i] < arr[i - 1]) {
            isSorted = false;
            break;
        }
    }

    if (isSorted) {
        cout << "Array is sorted." << endl;
    } else {
        cout << "Array is not sorted." << endl;
    }

    return 0;
}