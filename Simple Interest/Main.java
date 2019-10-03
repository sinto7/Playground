import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        
    Scanner sc=new Scanner(System.in);
      float d,e;
      int a=sc.nextInt();
      int b=sc.nextInt();
      float c=sc.nextFloat();
      d=a*b*c;
      e=d/100;
      System.out.printf("%.2f",e);
      
      
}
  
}