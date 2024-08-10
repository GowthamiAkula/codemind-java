import java.util.Scanner;
public class MinHours{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int min;
        min=sc.nextInt();
        int hour=min/60;
        int minute=min%60;
        System.out.printf("%d Hour(s) %d Minute(s)",hour,minute);
        sc.close();
    }
}