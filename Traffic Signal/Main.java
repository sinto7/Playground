import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
      float d=0,e;
      
      float a=sc.nextFloat();
      float b=sc.nextFloat();
      float c=sc.nextFloat();
      if(a>0)
        d=b/a;
       e=d*60*60;
      if(e<c)
      {
        System.out.printf("Yes");
      }
      else 
      {
        System.out.printf("No");
      }
    
	}
}