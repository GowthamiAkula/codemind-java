import java.util.Scanner;
public class AreaOfTrapezium{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double area=0.5*(a+b)*c;
        System.out.printf("%.4f",area);
        sc.close();
        
    }
}