import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      int b=sc.nextInt();
      if(a.contentEquals("front"))
         {
        if(b==1)
        {
          System.out.printf("Left Handed");
        }
        else 
        {
          System.out.printf("Right Handed");
        }
      }
       if(a.contentEquals("rear"))
         {
        if(b==1)
        {
          System.out.printf("Right Handed");
        }
        else 
        {
          System.out.printf("Left Handed");
        }
      }
    }
}
      
             