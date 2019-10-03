

#include<stdio.h>
int grt_of_3no(int n1,int n2);
  
int main(){
  int n1,n2,n3;
  scanf("%d%d%d",&n1,&n2,&n3);
   int greatest=grt_of_3no(n1,n2);
     printf("%d",grt_of_3no(greatest,n3));
   
  	return 0;
}
            int grt_of_3no(int n1,int n2)
            {
              int max=0;
              if(n1>n2)
              {
                max=n1;
              }
              else
              {
                max=n2;
              }
              return max;
            }
