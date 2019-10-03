import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int b=0,c=1,sum=0;
      int a=sc.nextInt();
      for(int i=1;i<=a-2;i++)
      {
        sum=b+c;
        b=c;
        c=sum;
      }
        System.out.println(sum);
      
    }
}