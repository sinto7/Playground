import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      char x=sc.next().charAt(0);
      if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
      {
               System.out.println("Vowel");
      }
      else if((x>=32)&&(x<=64))
              {
               System.out.println("Not an alphabet");
              }
              else
              {
              System.out.println("Consonant");
              }
      
      
      
    }
}