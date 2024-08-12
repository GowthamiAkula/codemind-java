import java.util.Scanner;
public class KingTours{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int max=n*5+m*7;
        System.out.printf("%d",max);
        }
}