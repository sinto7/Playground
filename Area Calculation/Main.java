import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int e=0,f=0;
     
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      float d=sc.nextFloat();
      e=a*a;
      f=b*c;
      
      System.out.println(e);
      System.out.println(f);
      System.out.printf("%.3f",3.14*d*d);
      

    }
}