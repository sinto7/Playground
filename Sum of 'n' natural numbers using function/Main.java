#include<stdio.h>
int sum_of_n_numbers(int n);
  
int main() 
{
  int n;
  scanf("%d",&n);
  printf("%d",sum_of_n_numbers(n));
  
    
  	return 0;
}
int sum_of_n_numbers(int n)
{
  int sum=0,i;
  for(i=1;i<=n;i++)
  {
    sum=sum+i;
  }
 //intf("%d",sum);

return sum;
}