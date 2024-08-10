import java.util.Scanner;
public class grosssalary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double salary,hra,da;
        salary=sc.nextDouble();
        hra=sc.nextDouble();
        da=sc.nextDouble();
        double pf=(12/100.0)*salary;
        double gs=salary+hra+da+pf;
        System.out.printf("%.2f
%.2f",pf,gs);
        sc.close();
        
    }
}