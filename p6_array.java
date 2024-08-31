import java.util.Scanner;

public class p6_array {
    public static void main(String[] args) {
        //p1
        float[] arr = new float[5];
        arr[0] = 1.23F;
        arr[1] = 2.34F;
        arr[2] = 3.45F;
        arr[3] = 4.56F;
        arr[4] = 5.67F;
        int i=0;
        float sum = 0F;
        int length = arr.length;
        while (i<length){
            sum+=arr[i];
            i++;
        }
        System.out.println("Sum of Array elements : "+sum);

        //p2
        float num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to be searched: ");
        num = sc.nextFloat();
        boolean check = false;
        for(int j=0;j<length;j++){
            if(arr[j]==num){
                System.out.println(arr[j]+" found at index "+j);
                check = true;
            }
        }
        if(!check){
            System.out.println("Element not found");
        }

        //p3
        float percentage = sum/5;
        System.out.println("\nPercentage: "+percentage+"%\n");

        //p4
        int[][] arr2 = new int[2][3];
        int[][] arr3 = new int[2][3];
        int[][] arr4 = new int[2][3];

        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[0][2] = 3;
        arr2[1][0] = 4;
        arr2[1][1] = 5;
        arr2[1][2] = 6;

        arr3[0][0] = 1;
        arr3[0][1] = 2;
        arr3[0][2] = 3;
        arr3[1][0] = 4;
        arr3[1][1] = 5;
        arr3[1][2] = 6;

        for(int j=0;j<arr2.length;j++){
            for(int k=0;k<arr2[0].length;k++){
                arr4[j][k]=arr2[j][k]+arr3[j][k];
            }
        }
        System.out.println("Sum of Array2 and Array3 : ");
        for(int j=0;j<arr2.length;j++){
            for(int k=0;k<arr2[0].length;k++){
                System.out.print(arr4[j][k]+" ");
            }
            System.out.print("\n");
        }

        //p5
        float[] rev = new float [5];
        int l=0;
        for(int j=length-1;j>=0;j--){
            rev[l] = arr[j];
            l++;
        }
        System.out.println("Reverse Array : ");
        for(int k=0;k<length;k++) {
            System.out.print("\n" + rev[k] + " ");
        }
        System.out.print("\n");

        //p6 //p7
        float max = arr[0];
        float min = arr[0];
        for(int j=0;j<length;j++){
            if(arr[j]>max){
                max = arr[j];
            }
            if(arr[j]<min){
                min = arr[j];
            }
        }
        System.out.println("\nMAX : "+max);
        System.out.println("MIN : "+min);

        //p8
        int flag = 0;
        for(int k=0;k<length-1;k++){
            for(int j=0;j<length-1;j++){
                if(arr[j]>arr[j+1]){
                    flag = flag+1;
                }
            }
        }
        if(flag!=0){
            System.out.println("\nArray is unsorted !");
        }
    }
}