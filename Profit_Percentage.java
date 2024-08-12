import java.util.Scanner;
public class ProfitPercentage{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cp,sp;
        cp=sc.nextInt();
        sp=sc.nextInt();
        int p=sp-cp;
        double pp=(p*100.0)/cp;
        System.out.printf("%.2f",pp);
        sc.close();
    }
}