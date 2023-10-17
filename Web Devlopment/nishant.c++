#include<bits/stdc++.h>
using namespace std;

void conversion(char charSet[],string &str)
{
    int n =str.length();
    char hashChar[12];
    for(int i =0; i <12; i++)
        hashChar[charSet[i]-'a']='a' + i;

        for(int i =0; i<n; i++)
            str[i] =hashChar[str[i]-'a'];
}
int main()
{
    char charSet[12] = "qwertyuiopas";
    string str ="crazy";
    conversion(charSet,str);
    cout<<str;
    return 0;
}