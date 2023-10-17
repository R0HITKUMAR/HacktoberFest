#include<iostream>
using namespace std; 

int main(){
    // pointers ----> data types which holds the address of other data types
    int a=3;
    int *b=&a;
    //&---> addres of operator
    cout<<"the addres of a is "<<b<<endl;
    cout<<"the addres of a is "<<&a<<endl;


    //*---> dereference of operator
    cout<<"the value at addres of a is "<<*b<<endl;

    //pointer to pointer
    int** c=&b;
    cout<<"the addres of b is "<<&c<<endl;
    return 0;
}