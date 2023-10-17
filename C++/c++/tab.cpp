#include<iostream>
using namespace std;

int main()
{
    int n,range;
    cout<<"enter the positive integer ";
    cin>>n;
    cout<<"enter range ";
    cin>>range;

    for (int i = 0; i < range; i++){
    cout<<n<<"*"<<i<<"="<<n*i<<endl;
    }
    return 0;
}