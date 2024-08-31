import java.util.Scanner;

public class p1_5_findINT {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        if(n==(int)(n)){
            System.out.println("the number is Integer");
        }
        else{
            System.out.println("the number is not Integer");
        }
    }
}
