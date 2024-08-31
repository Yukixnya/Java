
public class p3_strings {
    public static void main(String[] args) {

        //p1
        String name = "PAnda";
        name=name.toLowerCase();      //use another string to store cause strings are immutable
        System.out.println(name);

        String str = "HELLO";
        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());
        System.out.println(name.toUpperCase());

        //p2
        String BTTH = "Xiao Yan";
        BTTH = BTTH.replace(" ","_");
        System.out.println(BTTH);

        //p3
        String letter = "Hello <name> , why so so small !";
        System.out.println(letter);
        letter = letter.replace("<name>","Chotu");
        System.out.println(letter);

        //p4
        int c=0;
        for(int i=0;i<letter.length();i++){
            if(letter.charAt(i)==' '){
                c = c + 1;
            }
        }
        System.out.println("Total Space Count : "+c);

        //p5
        String form = "Hello %s , Are you %d+ ?";
        form=String.format(form,"Yuki",18);
        System.out.println(form);

        String line = "Hello %s , You are no.%d";
        System.out.printf((line),"Yuki",1);
    }
}