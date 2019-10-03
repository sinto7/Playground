import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=1,count=0,f=0;
      if(a<=1)
      {
        count=1;
      }
      else
      {
      for(int i=1;i<=a/2;i++) 
      {
        b=b*i;
        if(b==a)
        {
          f=1;
          break;
        }
        if(b>a)
        {
          f=0;
          break;
        }
      }
      }
      if(f==1)
      {
        System.out.printf("Yes");
        
      }
        else
        {
          System.out.printf("No");
      }
}
}