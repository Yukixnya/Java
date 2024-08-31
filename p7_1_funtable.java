public class p7_1_funtable {
    public static void table(int n) {
        for(int i = 1; i <= 10; i++) {
            System.out.print(n * i);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num = 4;
        table(num);
    }
}