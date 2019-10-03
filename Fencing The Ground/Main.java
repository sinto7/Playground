import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int c,d;
    
    int a=sc.nextInt();
    int b=sc.nextInt();
    c=a+a+b+b;
    d=a*b;
    System.out.printf("%dm\n",c);
    System.out.printf("%dsqm",d);
    
    
  }
}