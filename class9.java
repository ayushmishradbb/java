import java.util.Scanner;
public class class9 
{    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int a,b,c,d,e;
        double sum,avg;
        System.out.println("Enter any five numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        sum=a+b+c+d+e;
        avg=sum/5;
        System.out.println("The average of five numbers are "+avg);
        System.out.println("Thank You for using this software pleae try again");           
    }   
}