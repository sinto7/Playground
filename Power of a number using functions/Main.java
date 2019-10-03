
#include<stdio.h>
void main()
{
int b,e,num;
 scanf("%d%d",&b,&e);
num = change(b,e);
printf("%d",num);
}
int change(int m,int n)
{
 int h;

h = pow(m,n);
return h;
}