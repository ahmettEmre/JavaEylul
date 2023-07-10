package day06;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        /*
        Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        “Sayi 5’in tam kati” yazdirin.
         */

        Scanner  scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();

        //direk yazdıralım

        System.out.println(sayi%5==0 ? "Sayi 5’in tam kati" : "Sayi 5’in tam kati degil");

        // assigment yapalim

        String sonuc = sayi%5==0 ? "Sayi 5’in tam kati" : "Sayi 5’in tam kati degil" ;
        System.out.println(sonuc);
    }
}
