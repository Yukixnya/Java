import java.util.Scanner;
public class p4_3_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Salary : ");
        int salary = sc.nextInt();
            if (salary<250000)
                System.out.println("You dont have income tax");
            else if (salary<500000)
                System.out.println("tax to be paid = 5%");
            else if (salary<1000000)
                System.out.println("tax to be paid = 20%");
            else
                System.out.println("tax to be paid = 30%");
    }
}
