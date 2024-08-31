import java.util.Scanner;

public class p4_2_result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sub1 Marks");
        int sub1 = sc.nextInt();
        System.out.println("Enter Sub2 Marks");
        int sub2 = sc.nextInt();
        System.out.println("Enter Sub3 Marks");
        int sub3 = sc.nextInt();
        int sum = sub1 + sub2 + sub3;
        int percent = sum/3;
        if(sub1<33 || sub2<33 || sub3<33 || percent<40) {
            System.out.println("YOU FAILED !");
        }
        else{
            System.out.println("YOU PASSED !");
        }
    }
}