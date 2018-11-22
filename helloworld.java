import java.util.Scanner;
class helloworld 
{
     public static void main(String[] args)
    {
      Scanner sc=new Scanner (System.in);
      int n,max,i;
      System.out.println("Enter 10 numbers");
      n=sc.nextInt();
      max=n;
      for (i=1;i<=10;i++)
      {    n=sc.nextInt();
          if (n>=max)
              max=n;
      }
      System.out.println(max);
      
      
          
        
               
    }
     
    
}
