#include<stdio.h>
int main()
{
    char c;
    printf("enter the character\t");
    scanf("%c",&c);

    if( c>='A' && c<='Z' )
       {
        printf("it is uppercase character");
       }
    else if(c >='a'&& c<='z')
       {
       printf("it is lowercase character");
       }
    else
       {
       printf("it in not a character");
       }

    return 0;
}
