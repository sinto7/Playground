import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       float d;
      float a=sc.nextFloat();
      float b=sc.nextFloat();
      b=b*12;
      
      if(a>b)
        System.out.printf("Loss : Rs.%.2f",a-b);
      else if (a<b)
        System.out.printf("Profit : Rs.",b-a);
     else
         System.out.printf("No profit nor loss");
        
    }
      
}