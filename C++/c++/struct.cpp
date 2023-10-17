#include<iostream>
using namespace std;

struct employee
{
    int id;
    char favChar;
    float salary;
};
union money{
    int rice;
    char car;
    float pounds;
};

int main(){
    union money m1;
    m1.rice=34;
    cout<<m1.rice<<endl; 
    struct employee nishant;
    nishant.id=1;
    nishant.favChar='s';
    nishant.salary=200000;
    cout<<"the id is "<<nishant.id<<endl;
    cout<<"the salary "<<nishant.salary<<endl;
    cout<<"the favChar is "<<nishant.favChar<<endl;

    return 0;
}