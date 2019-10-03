import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int c;
      int a=sc.nextInt();
      int b=sc.nextInt();
      
      if(b<a)
      {
        b=b+100;
      }
      c=b-a;
      System.out.println(c);
      
        
        
    }
}