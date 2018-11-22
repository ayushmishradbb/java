import java.util.Scanner; 
public class factorial 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int n,p=1,i;
        System.out.println("Enter any number");
        n=sc.nextInt();
        for (i=1;i<=n;i++)
        {
            p=p*i;
        }
        System.out.println("The factorial of number "+n+" is "+p);
    }
    
    
}
