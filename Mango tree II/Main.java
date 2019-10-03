import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
     Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if((b%5==0)||(b<5)||a%5==1)
      {
        System.out.printf("Yes");
      }
      else
      {
        System.out.printf("No");
      }
      
	}
}