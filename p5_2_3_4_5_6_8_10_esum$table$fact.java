public class p5_2_3_4_5_6_8_10_esum$table$fact {
    public static void main(String[] args) {
        //p2
        int n=1,esum=0;
        while (n<=10) {
            if(n%2==0) {
                esum+=n;
            }
            n++;
        }
        System.out.println("Sum : "+esum);

        //p3
        int a=10,b=1;
        System.out.printf("TABLE OF %d\n",a);
        while(b<=10) {
            System.out.println(b*a);
            b++;
        }

        //p4
        int c=10,d=10;
        System.out.printf("REVERSE TABLE OF %d\n",c);
        while(d>0) {
            System.out.println(c*d);
            d--;
        }

        //p5
        int e=5,f=1;
        for(int i=1;i<=e;i++) {
            f*=i;
        }
        System.out.printf("FACTORIAL OF %d : "+f,e);

        //p6
        int g=5,h=1,G=5;
        while(g<=5 && g>0) {
            h*=g;
            g--;
        }
        System.out.printf("\nFACTORIAL OF %d :"+h,G);

        //p8
        int j=1,sum8=0;
        while(j<=50) {
            if(j%8==0) {
                sum8=sum8+j;
            }
            j++;
        }
        System.out.printf("\nSUM OF MULTIPLE OF 8 : "+sum8);

        //p11
        int k=10,Esum=0;
        for(int i=1;i<=k;i++) {
            if(i%2==0){
                Esum+=i;
            }
        }
        System.out.println("\nSum : "+Esum);
    }
}
