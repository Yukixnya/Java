import java.util.Scanner;

public class p4_6_url {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter URL");
        String url = sc.nextLine();
            if(url.contains(".com"))
                System.out.println("commercial enterprise");
            else if(url.contains(".org"))
                System.out.println("not-for-profit organization");
            else if (url.contains(".net"))
                System.out.println("entity involved in net infrastructure");
            else if (url.contains(".mil"))
                System.out.println("military");
            else if (url.contains(".gov"))
                System.out.println("government (federal)");
            else if (url.contains(".edu"))
                System.out.println("college-level educational institution");
            else
                System.out.println("URL not found");
    }
}
/*
.com — commercial enterprise
.org — not-for-profit organization
.net — entity involved in net infrastructure, such as an ISP
.mil — U.S. military
.gov — U.S. government (federal)
.edu — college-level educational institution
 */