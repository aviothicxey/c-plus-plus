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

//pyramid pattern
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


