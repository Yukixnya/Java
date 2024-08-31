import java.util.Scanner;

public class p1_2_std {
    public static void main(String[] args) {
        int i,a;
        float sum=0;
        System.out.println("enter 5 sub marks");
        for(i=1;i<=5;i++) {
            System.out.println("enter marks :");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            sum = sum+a;
        }
        System.out.println("Total Marks : "+(int)sum);
        System.out.println("Percentage : "+(sum/5)+"%");
    }
}