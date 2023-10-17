#include<iostream>
using namespace std;

struct employee
{
    int id;
    char favChar;
    float salary;
};

int main(){
    struct employee nishant;
    nishant.id=1;
    nishant.favChar='s';
    nishant.salary=200000;
    cout<<"the id is "<<nishant.id<<endl;
    cout<<"the salary "<<nishant.salary<<endl;
    cout<<"the favChar is"<<nishant.favChar<<endl;

    return 0;
}