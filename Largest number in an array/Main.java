#include<stdio.h>
int main()
{
  int arr_size,b,idx;
  scanf("%d",&arr_size);
  int arr[10];
    for(idx= 0;idx<=arr_size-1;idx++)
  {
    scanf("%d",&arr[idx]);
  }
  
  b=arr[0];
   for(idx= 1;idx<=arr_size-1;idx++)
  {
     if(arr[idx]>b)
       b=arr[idx];
    
  }
    printf("%d",b);
  return 0;
}
  
        