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



//using vector:


#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return {i, j};
                }
            }
        }
        return {0}; // return zero if not found
    }
};

int main() {
    int n;
    cout << "Enter size of array: ";
    cin >> n;

    vector<int> arr(n);
    for (int i = 0; i < n; i++) {
        cout << "Element " << i << ": ";
        cin >> arr[i];
    }

    int target;
    cout << "Enter target: ";
    cin >> target;

    Solution sol;
    vector<int> result = sol.twoSum(arr, target);

    if (!result.empty()) {
        cout << "[" << result[0] << ", " << result[1] << "]" << endl;
    } else {
        cout << "No two numbers found that add up to target." << endl;
    }

    return 0;
}
