import java.util.Scanner;
public class swap
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int t=a;
        a=b;
        b=t;
        System.out.printf("%d
%d",a,b);
        sc.close();
    }
}