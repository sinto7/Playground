#include<stdio.h>
int main()
{
  int num1,num2;
  scanf("%d%d",&num1,&num2);
  if(num1>num2)
    printf("num1 is the greatest");
   else if(num2>num1)
    printf("num2 is the greatest");
  else
    printf("both are equal");
  
    
  return 0;
}