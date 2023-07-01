package day02;

import java.util.Scanner;

public class C08_Odev4 {

    /*
        Soru 4 - Kullanicidan iki sayi alip
        ikisinin degerlerini degistirin(swap).

        kullanicinin girdigi degerler
        sayi1= 10  sayi2=20 ise

        siz kod ile bunlarin degerlerini degistirip
        sayi1=20  sayi2=10 yapin
     */

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("2 sayi girin");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int sayi3;

        sayi3=sayi1;
        sayi1=sayi2;
        sayi2=sayi3;

        System.out.println(sayi1 + "\n" +sayi2);


    }
}
