#include <stdio.h>
struct student {
    char firstName[50];
    int id;
    float salary;
} s[10];

int main() {
    int i;
    printf("Enter information of employs name:\n");
    for (i = 0; i < 5; ++i) {
        s[i].id = i + 1;
        printf("\n employs id:%d,\n", s[i].id);
        printf("Enter first name: ");
        scanf("%s", s[i].firstName);
        printf("salary: ");
        scanf("%f", &s[i].id);
    }
    printf("Displaying Information:\n\n");
     for (i = 0; i < 5; ++i)
    {
        printf("\n employs id: %d\n", i + 1);
        printf("First name: ");
        puts(s[i].firstName);
        printf("salary: %.1f", s[i].id);
        printf("\n");


    }
return 0;
}

