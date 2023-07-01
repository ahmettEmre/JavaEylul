package day02;

import java.util.Scanner;

public class C06_Odev2 {

    //Soru 2 - Kullanicidan bir sayi isteyin ve sayinin karesini yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println("Sayilarin karesi : " + (sayi*sayi));

    }
}
