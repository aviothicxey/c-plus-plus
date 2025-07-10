//SELECT SORT:
//Sort array in increasing order :(using functions)
# include <iostream>
using namespace std;
void sortArray(int numbers[], int size){ //numbers is the array we need to sort, size is the number of elements.
    for (int current = 0 ; current < size - 1 ; current++){ //current points to the index we are trying to place correctly, outer loop moves from start to last second.
        int smallestIndex = current; //let current be the smaalest number for now.
        for ( int next = current + 1 ;next < size ; next++){ //inner loop compares all elements after current.
            if (numbers[next]<numbers[smallestIndex]){  // If we find a number smaller than our current smallest, update the index.
                smallestIndex = next;
            }
        }
        //swap the current element with the smallest one found.
        int temp = numbers[current];
        numbers[current] = numbers[smallestIndex];
        numbers[smallestIndex] = temp;
    }
} 
void printArray(int numbers[],int size){// this function takes the array and its size and prints all elements . 
    cout << " sorted arrray : "; //a simple loop to print each element with space .
    for(int i = 0;i< size ; i++){
        cout << numbers[i]<<" ";
    }
    cout << endl;
}
int main(){
    int total ; //elements user wants to enter .
    int numbers[100];//array that can hold up to 100 integers . 
    cout<<"Enter total number : ";
    cin>>total;
    for(int i = 0; i<total ; i++){
        cin>> numbers[i];
    }//loop to take user input and store the values in an array .
    sortArray(numbers,total);//call the sortArray() function to sort numbers.
    printArray(numbers,total);//call printarray function to print sorted array .
    return 0;
}


// with class:


#include <iostream>
using namespace std;

class Sorter {
    int numbers[100]; // Array to store numbers
    int count;        // Number of elements

public:
    void takeInput() {
        cout << "Enter how many numbers: ";
        cin >> count;

        cout << "Enter numbers: ";
        for (int i = 0; i < count; i++) {
            cin >> numbers[i];
        }
    }

    void sortNumbers() {
        for (int i = 0; i < count - 1; i++) {
            int smallestIndex = i;

            for (int j = i + 1; j < count; j++) {
                if (numbers[j] < numbers[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            // Swap
            int temp = numbers[i];
            numbers[i] = numbers[smallestIndex];
            numbers[smallestIndex] = temp;
        }
    }

    void showResult() {
        cout << "Sorted numbers: ";
        for (int i = 0; i < count; i++) {
            cout << numbers[i] << " ";
        }
        cout << endl;
    }
};

int main() {
    Sorter sorter;
    sorter.takeInput();
    sorter.sortNumbers();
    sorter.showResult();

    return 0;
}



//BUBBLE SORT:

//USING CLASS:
#include<iostream>
using namespace std;
class bubbleSort{
    int arr[100];
    int count;
    public:
    void input(){
        cout<<"enter the number of elements : ";\
        cin>>count;
        for(int i = 0 ; i < count ; i++){
            cout<<"enter element:"<<i<<" : "<<endl;
            cin>>arr[i];
        }
    }
    void sortArray(){
        for (int round = 0; round < count - 1 ;round++ ){
            for(int i = 0 ; i < count - round - 1 ; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i + 1 ] = temp;
                }
            }
        }
    }
    void showSortArray(){
        cout<<"Sorted Array: ";
        for(int i = 0 ; i < count; i++){
            cout << arr[i] << " "<<endl;
        }
    }
};
int main() {
    bubbleSort b;
    b.input();
    b.sortArray();
    b.showSortArray();

    return 0;
}