import java.util.Scanner;

public class p2_3_compare {
    public static void main(String[] args) {
        int a=10;
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
        if(a<b){
            System.out.println(b+" is greater than "+a);
        }
        else if (a==b) {
            System.out.println(a+" is equal to "+b);
        }
        else {
            System.out.println(a+" is less than "+b);
        }
    }
}
