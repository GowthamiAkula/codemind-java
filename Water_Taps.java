import java.util.Scanner;
public class WaterTaps
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int z=a*b;
        int p=a+b;
        int work=z/p;
        System.out.println(work);
        sc.close();
    }
}