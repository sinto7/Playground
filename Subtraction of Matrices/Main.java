
#include<stdio.h>
int main()
{
int r,c,i,j;

scanf("%d%d",&r,&c);
int arr1[r][c],arr2[r][c];
for(i=0;i<r;i++)
{
  for(j=0;j<c;j++)
  {
    scanf("%d",&arr1[i][j]);
  }
}
for(i=0;i<r;i++)
{
  for(j=0;j<c;j++)
  {
    scanf("%d",&arr2[i][j]);
  }
}
for(i=0;i<r;i++)
{
  for(j=0;j<c;j++)
  {
    printf("%d ",arr1[i][j]-arr2[i][j]);
  }
  printf("\n");
}
}