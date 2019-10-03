#include<stdio.h>
int main(){
int r,c,i,j,k;
  scanf("%d%d",&r,&c);
  int arr[r][c];
  
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&arr[i][j]);
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0,k=i;k<c;j++,k++)
    {
   
      printf("%d ",arr[j][k]);
    }
  }
   
    
 printf("\n");
}