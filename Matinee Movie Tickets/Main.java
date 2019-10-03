import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      float b=sc.nextFloat();
      if(a>=13)
        if(b>=12.0 && b<16.0f)
        {
          System.out.printf("$5.00");
        }
        else
        {
          System.out.printf("$8.00");
        }
        
      
      
      if(a<13)
        if(b>=12.0f && b<16.0f)
        {
          System.out.printf("$2.00");
        }
          else
          {
            System.out.printf("$4.00");
        }
    }
                            
	}
