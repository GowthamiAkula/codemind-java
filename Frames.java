import java.util.Scanner;
public class frames{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int ans;
        ans=2*(a+b)*c;
        System.out.println(ans);
        sc.close();
    }
}