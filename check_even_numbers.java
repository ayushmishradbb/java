import java.util.Scanner;
public class check_even_numbers 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int n,i,c=0;
        System.out.println("Enter 10 numbers");
        for (i=1;i<=10;i++)
        {    n=sc.nextInt();
            if (n%2!=0)
                c++;
        }
        if (c==0)
            System.out.println("All numbers are even");
        else 
            System.out.println("All numbers are not even");
            
    }
    
}
