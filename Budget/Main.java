import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      float f;
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int d=sc.nextInt();
      int e=sc.nextInt();
      f=(a*350.34f)+(b*230.90f)+(c*190.55f)+(d*125.30f)+(e*180.90f);
      if(f<15000)
      {
        System.out.printf("Yes");
      }
      else
      {
        System.out.printf("No");
      }
      
	}
}