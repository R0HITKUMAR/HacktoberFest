#include<iostream>
using namespace std;
int main(){
    int quotient,divisor,reminder,dividend,end1;
    cout<<"enter dividend";
    cin>>dividend;
    cout<<"enter divisor";
    cin>>divisor;
    quotient=dividend/divisor;
    reminder=dividend%divisor;

    cout<<"quotient ="<<quotient<<end1; 
    cout<<"reminder="<<reminder;
    
    return 0;
}