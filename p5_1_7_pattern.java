public class p5_1_7_pattern {
    public static void main(String[] args) {
        //p1
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //p7
        int k=5,l=5;
        while(k<=5){
            while(l<=k-1){
                System.out.print("*");
                l++;
            }
            k++;
        }
    }
}
