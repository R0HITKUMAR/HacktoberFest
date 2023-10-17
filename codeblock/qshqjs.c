#include <stdio.h>
int main()
 {
    int num1,num2;
    float result;
    char ch,age,name[20];
    printf("enter your name:");
    gets(name);
    printf("Enter your age:");
    scanf("%d",&age);
    if
        (age>18)
        {
        printf("%s eligible for calculator",name);
        printf("\nChoose operation to perform (+,-,*,/,%): ");
        scanf(" %c",&ch);
        printf("Enter first number: ");
        scanf("%d",&num1);
        printf("Enter second number: ");
        scanf("%d",&num2);
        result=0;
    switch(ch)
    {
        case '+':
            result=num1+num2;
            break;

        case '-':
            result=num1-num2;
            break;

        case '*':
            result=num1*num2;
            break;

        case '/':
            result=(float)num1/(float)num2;
            break;

        case '%':
            result=num1%num2;
            break;
        default:
            printf("Invalid operation.\n");
    }

         printf("Result: %d %c %d = %f\n",num1,ch,num2,result);
        }
    else
        {
        printf("%s not eligible for calculator",name);
        }

    return 0;
}
