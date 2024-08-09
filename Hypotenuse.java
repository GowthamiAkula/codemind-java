import java.util.Scanner;
public class hypotenuse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        double hyp=Math.sqrt(a*a+b*b);
        System.out.printf("%.2f",hyp);
        sc.close();
    }
}