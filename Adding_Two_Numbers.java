import java.util.Scanner;
public class addition
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int add=a+b;
        System.out.println(add);
        sc.close();
    }
}