import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
          int e,k;
      float f,g,h,i;
      String a=sc.nextLine();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int d=sc.nextInt();
      if(a.contentEquals("MSDS"))
      {
        e=b+c;
       System.out.printf("%d",e);
    }
       else if(a.contentEquals("MSH"))
       {
        k=b+d;
      System.out.printf("%d",d);
       }
      else if(a.contentEquals("MGSDS"))
        
      {
        f=b*1.5f;
        g=f+c;
      System.out.printf("%.2f",g);
      }
      else if (a.contentEquals("MGSH"))
      {
        h=b*1.5f;
        i=h+d;
        System.out.printf("%.2f",i);
        
      }
      else
      {
        System.out.printf("default");
      }                   
    }
}