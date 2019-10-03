import java.io.*;
class Main
{
public static void main(String args[])throws IOException
{
     
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      float a=Float.parseFloat(br.readLine());
       float b=Float.parseFloat(br.readLine());
       float c=Float.parseFloat(br.readLine());
       float d=Float.parseFloat(br.readLine());
       float e=Float.parseFloat(br.readLine());
      float f=Float.parseFloat(br.readLine());
      float g=Float.parseFloat(br.readLine());
      float i=0,j=0,k=0,l=0,m=0,n=0,s=0;
       a=a*100;
      a=(a*1.5f);
      n=b+c+d+e+f;
      if(b>8){
      i=b-8;
      b=100*b+15*i;}
      else
        b=b*100;
      if(c>8){
      j=c-8;
      c=100*c+15*j;}
      else
        c=100*c;
      if(d>8){
      k=d-8;
      d=100*d+15*k;}
      else
       d=100*d;
      if(e>8){
      l=e-8;
      e=100*e+15*l;}
      else
        e=100*e;
      if(f>8){
      m=f-8;
      f=100*f+15*m;}
      else
        f=100*f;
      g=g*100;
      g=g*1.25f;
      if(n>40){
        n=n-40;
        n=n*25;}
     
      s=a+b+c+d+e+f+g;
    
        System.out.println(s);
   

     
}
}
