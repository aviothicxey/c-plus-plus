/*
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
*/
/*
// TRANSPOSE OF A MATRIX:
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

    cout << "Transpose of the matrix is:\n";
    for(int i = 0; i < cols; i++){
        for(int j = 0; j < rows; j++){
            cout << matrix[j][i] << " ";
        }
        cout << endl;
    }

    return 0;
}
*/

//INPUT MATRIX AND CHECK IF IT IS SYMMETRIC:
#include<iostream>
using namespace std;

int main() {
    int rows, cols;
    cout << "Enter number of rows and columns: ";
    cin >> rows >> cols;

    if (rows != cols) {
        cout << "Matrix is not square, hence not symmetric." << endl;
        return 0;
    }

    int matrix[rows][cols];

    cout << "Enter elements of the matrix:\n";
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cin >> matrix[i][j];
        }
    }

    // Check for symmetry
    bool isSymmetric = true;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (matrix[i][j] != matrix[j][i]) {
                isSymmetric = false;
                break; // Exit early if mismatch found
            }
        }
        if (!isSymmetric)
            break;
    }

    if (isSymmetric)
        cout << "The matrix is symmetric." << endl;
    else
        cout << "The matrix is not symmetric." << endl;

    return 0;
}
