package day04;

import java.util.Scanner;

public class C06_IfSorular3 {
    public static void main(String[] args) {
        /*
                Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
                NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
                Kullanici o veya O yazdiginda output Ocak olsun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz:");
        char harf = scan.next().charAt(0);

        if (harf== 'O' || harf== 'o') System.out.println("Ocak");
        if (harf== 'Ş' || harf== 'ş') System.out.println("Şubat");
        if (harf== 'M' || harf== 'm') System.out.println("Mart , Mayıs");
        if (harf== 'N' || harf== 'n') System.out.println("Nisan");
        if (harf== 'H' || harf== 'h') System.out.println("Haziran");
        if (harf== 'T' || harf== 't') System.out.println("Temmuz");
        if (harf== 'A' || harf== 'a') System.out.println("Ağustos , Aralık");
        if (harf== 'E' || harf== 'e') System.out.println("Eylül, Ekim");
        if (harf== 'K' || harf== 'k') System.out.println("Kasım");

    }
}
