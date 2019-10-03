#include<stdio.h>
int main()
{
	int r,c,flg=0;
  scanf("%d %d",&r,&c);
 int  arr1[r][c],arr2[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      scanf("%d",&arr1[i][j]);
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      scanf("%d",&arr2[i][j]);
    }
  }
   for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
  		if(arr1[i][j]!=arr2[i][j])
  			{
      		flg=1;
         	 
    
   			}     
    }
   }
     
    if(flg==1)
    {
        printf("No");
    }
      else
      {
        printf("Yes");
      }
    
 
	return 0;
}