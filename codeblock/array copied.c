#include <stdio.h>

 int main()
 {
   int original[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
   int copied[10];
   int i, count;

   count = 9;

   for(i = 0; i < 10; i++) {
      copied[count] = original[i];
      count--;
   }

   printf("original -> copied \n");

   for(i = 0; i < 10; i++) {
      printf(" %d         %d\n", original[i], copied[i]);
   }

   return 0;
}
