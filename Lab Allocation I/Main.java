import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if(a<b&&a<c)
      {
        System.out.printf("L1");
        
    }
      else if(b<c)
      {
        System.out.printf("L2");
        
      }
      else
      {
        System.out.printf("L3");
      }
    }
}