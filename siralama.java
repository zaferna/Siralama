import java.util.Scanner;

public class siralama {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a,b,c;
        System.out.print("1. Sayiyi Gir:");
        a= in.nextInt();
        System.out.print("2. Sayiyi Gir:");
        b= in.nextInt();
        System.out.print("3. Sayiyi Gir:");
        c= in.nextInt();

        if(a<b&&a<c){
            if(b<c) {
                System.out.println("a<b<c");
            }else {
                System.out.println("a<c<b");

            }

        } else if (b<a&&b<c) {
            if(a<c) {
                System.out.println("b<c<a");
            }else {
                System.out.println("b<a<c");

            }

        }
        else if (c<a&&c<b) {
            if(a<b) {
                System.out.println("c<b<a");
            }else {
                System.out.println("c<a<b");

            }

        }


    }
}
