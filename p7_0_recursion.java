public class p7_0_recursion {
    public static int factorial(int n) {
        if(n==0){
            return 1;
        }else {
            return factorial(n - 1) * n;
        }
    }
    public static void main(String[] args) {
        int num=3;
        System.out.println(factorial(num));
    }
}