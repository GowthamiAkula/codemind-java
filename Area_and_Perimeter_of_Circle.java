import java.util.Scanner;
public class circle{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r;
        r=sc.nextInt();
        double area=3.14*r*r;
        double perimeter=2*3.14*r;
        System.out.printf("%.2f
",area);
        System.out.printf("%.2f",perimeter);
        sc.close();
        
    }
}