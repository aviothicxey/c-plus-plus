// //  q1 
// #include <iostream>
// using namespace std;
// class Student{
//     string name;
//     int age;
//     int rollNumber;
//     public:
//     Student(string n , int a , int r){
//         name = n ;
//         age = a ;
//         rollNumber = r ;
//     }
//     void display(){
//         cout << "name : "<< name << " , roll number : "<<rollNumber << " , age :  "<< age << endl; 
//     }
// };
// int main() {
//     string name;
//     int roll;
//     int age;
    
//     cout << "Enter name: ";
//     getline(cin, name);

//     cout << "Enter roll: ";
//     cin >> roll;
//     cout<< " enter age : ";
//     cin >> age;

//     Student s1(name,age , roll);
//     s1.display();

//     return 0;
// }


// // q2 : 

// #include<iostream>
// using namespace std;
// class Rectangle{
//     int width ;
//     public:
//     int length;
//     Rectangle(int w , int l){
//         width = w ;
//          length = l;
//     }
//     int area(){
//     return length*width;
//     }
//     int perimeter (){
//         return 2 * (length*width);
//     }
//     void display(int w){
//     width=w;
//     }
//     int output(){
//         return width;
//     };
// };
// int main(){
//     Rectangle R(1,4);
//     cout<< R.area()<<endl;
//     cout<< R.perimeter()<<endl;
//     return 0;
// }



