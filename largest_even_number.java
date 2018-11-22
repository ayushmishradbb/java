import java.util.Scanner;
public class largest_even_number 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int n,i,max=0;
        System.out.println("Enter 10 numbers");
        for (i=1;i<=10;i++)
        {
            n=sc.nextInt();
            if (n%2==0)
                if (n>=max)
                    max=n;
        }
        if (max>0)
             System.out.println("The maximum even number is "+max);
        else 
            System.out.println("No even number was found");
    }
}
//This is the perfect program and the output is also correct.......!