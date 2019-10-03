import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int b,sum=0;
      int a=sc.nextInt();
      int  temp=a;
      while (a!=0)
      {
        b=a%10;
        
        sum=sum+b;
        a=a/10;
        
      
      }
      
       System.out.printf("Alice must go in path-%d",sum); 
        
        
      
      
	}
}