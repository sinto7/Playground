import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if((c%a==0)||(c%a==1)||(c<a))
      {
        System.out.printf("Yes");
      }
        else
        {
          System.out.printf("No");
        }
    }
}