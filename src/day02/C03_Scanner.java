package day02;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        /*
        Kullanicidan 2 sayi alin ve bu sayilari toplayin
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bana 2 sayi girin");

        int sayi1=scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println("Girmis oldugunuz sayilarin toplami : "+ (sayi1+sayi2));
    }
}
