import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      if(a==100)
      {
        System.out.printf("S");
      }
      else if(a>=90&&a<=99)
      {
        System.out.printf("A");
      }
      else if(a>=80&&a<=89)
      {
        System.out.printf("B");
      }
      else if(a>=70&&a<=79)
      {
        System.out.printf("C");
      }
      else if(a>=60&&a<=69)
      {
        System.out.printf("D");
      }
      else if(a>=50&&a<=59)
      {
        System.out.printf("E");
      }
      else 
      
      {
        System.out.printf("F");
        
        
        
      }
    }
}