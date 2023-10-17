#include<iostream>
using namespace std;
//if else statements
int main(){
    /*int n;


   cout<<"enter the number";
    cin>>n;
    if(n%2==0)
    {
        cout<< "this is the even number " ;
    }
    else
    {
        cout<<"this is the odd number ";
    }*/


// the no. is prime or not

int i,n;
bool isPrime = true;

cout<<"Enter the positive integer:";
cin>> n;

if(n==0 || n==1) {
    isPrime = false;
}
else{
    for(i=2; i<=n/2; ++i){
        if( n % 1 ==0){
            isPrime = false;
            break;
        }
    }
}
if (isPrime)
    cout <<n<<" is a prime number";
else
    cout <<n<<" is not a prime number";
  return 0;
}