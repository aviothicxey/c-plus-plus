
// PRINT DIAGONAL ELEMENTS OF A MATRIX:

#include<iostream>
using namespace std;
int main(){
    int rows, cols;
    cout << "Enter number of rows and columns: ";
    cin >> rows >> cols;

    int matrix[rows][cols];
    cout << "Enter elements of the matrix:\n";
    for(int i = 0; i < rows; i++){
        for(int j = 0; j < cols; j++){
            cin >> matrix[i][j];
        }
    }

    cout << "Diagonal elements are:\n";
for(int i = 0; i < rows ; i++){
        for (int j = 0 ; j < cols; j++){
        if(i == j) {
            cout << matrix[i][j] << " ";
        }
    }
}
    cout << endl;

    return 0;
}

