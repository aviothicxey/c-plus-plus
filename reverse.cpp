
// #include <iostream>//header file for input and output
// #include<sstream>//It helps us break a sentence into words easily
// #include<vector>//a vector is like a smart box where you can keep things (like a list of words). You can grow or shrink this box as needed.
// #include<algorithm>//This toolbox gives us helpful shortcuts like reverse() to flip things backward
// using namespace std;//you will not need to write std:: again and again.
// int main(){
//     string s= " amazing coding skills ";
//     stringstream ss (s);//breaking the string into words
//     string word;//empty box to temporarily store each word
//     vector<string> words;//This creates an empty list of words called words
//     while(ss>> word){
//         words.push_back(word);
//     }
//     /* 
//     ss >> word means “Take the next word from the sentence and put it into word.”
// It skips all extra spaces between the words automatically.
// words.push_back(word) means “Put the word into our basket (the vector).”
// This continues until there are no words left in the sentence.
//     */
//     reverse(words.begin(),words.end());//This takes all the words in the basket and reverses their order.
//     string result = "";//We make a new empty string called result.
//     for(int i =0;i<words.size();i++){
//         result = result + words[i];
//         if(i!= words.size()-1){
//             result = result + " ";
//         }
//     }
//     /*
// This is another loop to put all the words together into result.
// words[i] means "the i-th word" (like picking from a list).
// result += words[i]; means “Add the word to the result string.”
// Then, if it’s not the last word, we add one space.
// We avoid adding space at the end — to keep it clean!
//     */
//     cout<<"\""<<result<<"\""<<endl;
//     return 0;

// }
// */

// // REVERSE A STRING USING LOOP :
// #include <iostream>
// using namespace std;

// int main() {
//     string str, rev = "";
//     cout << "Enter a string: ";
//     getline(cin, str);

//     for (int i = str.length() - 1; i >= 0; i--) {
//         rev += str[i];
//     }
//     cout << "Reversed string: " << rev << endl;
//     return 0;
// }

#include<iostream>
using namespace std;
int main(){
    int num;
    int reverse = 0;
    cout << " enter a number ";
    cin>> num;
    while ( num != 0){
        int digit = num % 10;
        reverse = reverse * 10 + digit ;
        num = num / 10;
    }
    cout << " reversed number : "<< reverse ;
    return 0;
}