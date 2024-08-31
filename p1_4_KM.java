import java.util.Scanner;

public class p1_4_KM {
    public static void main(String[] args) {
        System.out.println("Enter Distance in KM: ");
        Scanner sc = new Scanner(System.in);
        float distance = sc.nextFloat();
        float miles = (float) (distance * 0.62137119);
        System.out.println("Distance in Miles: " + miles+" miles");
    }
}
