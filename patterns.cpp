#include<iostream>
using namespace std;
int main(){
    for(int i = 0 ; i < 4 ; i++){
        for (int j = 0 ; j < 4 ; j++){
            cout << "*";
        }
        cout << endl;
    }
}

//right angles triangle:
#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
 for(int i = 0 ; i < 4 ; i++){
        for (int j = 0 ; j <= i ; j++){
            cout << "*";
        }
        cout << endl;
    }
}

//0
// 11
// 222
// 3333

#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
 for(int i = 0 ; i < 4 ; i++){
        for (int j = 0 ; j <= i ; j++){
            cout << i;
        }
        cout << endl;
    }
}

// 0
// 01
// 012
// 0123

#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
 for(int i = 0 ; i < 4 ; i++){
        for (int j = 0 ; j <= i ; j++){
            cout << j;
        }
        cout << endl;
    }
}


// *****
// ****
// ***
// **
// *

#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
 for(int i = 0 ; i <= 4 ; i++){
        for (int j = 0 ; j < 4 - i + 1  ; j++){
            cout << "*";
        }
        cout << endl;
    }
}


// 01234
// 0123
// 012
// 01
// 0

#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
 for(int i = 0 ; i <= 4 ; i++){
        for (int j = 0 ; j < 4 - i + 1  ; j++){
            cout << j;
        }
        cout << endl;
    }
}

       
//    *   
//   ***  
//  ***** 
// *******

#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int n ;
	cin>>n;
 for(int i = 0 ; i < n ; i++){
     //space
     for(int j = 0 ; j < n - i - 1 ; j++){
         cout<<" ";
     }
     //stars
     for(int j = 0 ; j < 2 * i - 1 ; j++){
         cout<<"*";
     }
     //space
     for(int j = 0 ; j < n - i - 1 ; j++){
         cout<<" ";
     }
     cout<<endl;
}
}