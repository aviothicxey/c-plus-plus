#include <iostream>
using namespace std ;
class Book{
    public:
    string title ;
    string author ;
    int year ;
};
int main(){
Book book1;
book1.author = "Matilda";
book1.title = "Roald Dahl";
book1.year = 1988;

Book book2;
book2.author= " The Giving Tree";
book2.title = " Shel Silverstein";
book2.year = 1964;

cout << book1.author << " , " << book1 . title << " , " << book1.year <<"\n";
cout << book2.title << ", " << book2.author << ", " << book2.year;
return 0 ;
}