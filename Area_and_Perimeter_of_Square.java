import java.util.Scanner;
public class Square{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int area=a*a;
        int perimeter=4*a;
        System.out.printf("%d %d",area,perimeter);
        sc.close();
    }
}