#include<iostream>
using namespace std;
int main(){
    int a,b,sum,sub,mult,flot,quiotent,remainder;
    cout<<"enter the value of a ";
    cin>>a;
    cout<<"enter the value of b ";
    cin>>b;
    sum=a+b;
    sub=a-b;
    mult=a*b;
    quiotent=a/b;
    flot=a%b;
    cout<<"sum="<<sum;
    cout<<"\nsub="<<sub;
    cout<<"\nmult="<<mult;
    cout<<"\nquiotent ="<<quiotent;
    cout<<"\nflot="<<flot;
return 0;
}