import java.util.Scanner;
public class naturalnumbers
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int ans=(n*(n+1))/2;
        System.out.println(ans);
        sc.close();
    }
}