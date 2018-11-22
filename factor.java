import java.util.Scanner;
public class factor 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int n,i,c = 0;
        System.out.println("Enter any number");
        n=sc.nextInt();
        for (i=1;i<=n;i++)
        {
            if (n%i==0)
            {    
                c=c+1;
            }
        }
        System.out.print(c);
    }
}
