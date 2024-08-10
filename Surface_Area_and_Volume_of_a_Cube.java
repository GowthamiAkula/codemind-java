import java.util.Scanner;
public class Cube
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sa=6*a*a;
        int v=a*a*a;
        System.out.printf("Surface area = %d and Volume = %d",sa,v);
        sc.close();
    }
}