import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int count=0;
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int d=sc.nextInt();
      if(a>d)
      {
        count++;
      }
        if(b>d)
      {
         count++;
       }
       if(c>d)
      {
      count++;
      
     
      }
       System.out.println(count);
    }
}
 
  

