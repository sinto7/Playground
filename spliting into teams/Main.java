import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
  int c,d;
  int a=sc.nextInt();
  int b=sc.nextInt();
  
  c=a/b;
  d=a%b;
  System.out.printf("The number of students in each team is %d and left out is %d",c,d);
    
    
}
}