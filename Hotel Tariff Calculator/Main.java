import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
      float d,e;
		int a=sc.nextInt();
      float b=sc.nextFloat();
      int c=sc.nextInt();
      switch(a)
      {
        case 4:
        case 5:
        case 6:
        case 11:
        case 12:
          
          e=(b*c*1.2f);
          
          System.out.printf("%.2f",e);
          break;
        case 1:
        case 2:
        case 3:
        case 7:
        case 8:
        case 9:
        case 10:
          d=b*c;
          System.out.printf("%.2f",d);
      break;

          
      default:
       System.out.printf("Invalid Input");
      } 
	}
}