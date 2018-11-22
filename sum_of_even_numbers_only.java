import java.util.Scanner;
public class sum_of_even_numbers_only 
{
   public static void main(String[] args)
   {
       int n,i,sum=0;
       Scanner sc=new Scanner (System.in);
       System.out.println ("Enter 10 numbers");
       for (i=1;i<=10;i++)
       {    
           n=sc.nextInt();
           if (n%2==0)
               sum=sum+n;
       }
       System.out.println("The sum of even numbers are "+sum);
   }
}
