#include<iostream>
using namespace std;

int main(){
    int marks[4]={22,24,26,56};
    int mathmarks[4]={23,76,98,100};
    cout<<"these are marks"<<endl;
    cout<<marks[0]<<endl;
    cout<<marks[1]<<endl;
    marks[2]=78;       //can change any array value;
    cout<<marks[2]<<endl;
    cout<<marks[3]<<endl;

    /* cout<<"these are maths marks"<<endl;
    cout<<mathmarks[0]<<endl;
    cout<<mathmarks[1]<<endl;
    cout<<mathmarks[3]<<endl;
    cout<<mathmarks[2]<<endl;*/
    for (int i = 0; i <4 ; i++)
    {
        cout<<"the value of marks "<<i<<" is "<<marks[i]<<endl;
         
    }
    
    //pointers and array
    int*p=marks;
      cout<<*(p++)<<endl;
      cout<<*(++p)<<endl;
      // cout<<"the value of *p "<<*p<<endl;
      // cout<<"the value of *(p+1) "<<*(p+1)<<endl;
      // cout<<"the value of *(p+2) "<<*(p+2)<<endl;
      // cout<<"the value of *(p+3) "<<*(p+3)<<endl;

    
    return 0;
}