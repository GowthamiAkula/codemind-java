import java.util.Scanner;
public class LossPercentage{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int cp,sp;
        cp=sc.nextInt();
        sp=sc.nextInt();
        int loss=cp-sp;
        double lp=(loss*100.0)/cp;
        System.out.printf("%.2f",lp);
        sc.close();
    }
    
}