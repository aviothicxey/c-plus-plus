//Sort array in increasing order :(using functions)
# include <iostream>
using namespace std;
void sortArray(int numbers[], int size){
    for (int current = 0 ; current < size - 1 ; current++){
        int smallestIndex = current;
        for ( int next = current + 1 ;next < size ; next++){
            if (numbers[next]<numbers[smallestIndex]){
                smallestIndex = next;
            }
        }
        int temp = numbers[current];
        numbers[current] = numbers[smallestIndex];
        numbers[smallestIndex] = temp;
    }
} 
void printArray(int numbers[],int size){
    cout << " sorted arrray : ";
    for(int i = 0;i< size ; i++){
        cout << numbers[i]<<" ";
    }
    cout << endl;
}
int main(){
    int total ;
    int numbers[100];
    cout<<"Enter total number : ";
    cin>>total;
    for(int i = 0; i<total ; i++){
        cin>> numbers[i];
    }
    sortArray(numbers,total);
    printArray(numbers,total);
    return 0;
}