public class p2_2_encrypt {
    public static void main(String[] args) {
        char grade = 'F';
        //encryption
        grade = (char) (grade - 5);
        System.out.println(grade+"+");

        //decryption
        grade = (char) (grade + 5);
        System.out.println(grade+"-");
    }
}
