package day05;

import java.util.Scanner;

public class C03_nestedIf {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        //oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
        //yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        long sayi = scan.nextLong();

        if (sayi%2 ==1 ){
            if (sayi<0) System.out.println("Girilen sayı negatif bir tek sayıdır.");
            else System.out.println("Girilen sayı pozitif bir tek sayııdr.");
        } else System.out.println("Girilen sayı bir çift sayıdır.");

        if (sayi%10 == 0) System.out.println("Ve girilen sayı 10'un katı bir çift sayıdır. ");
        else System.out.println("Girilen sayı 10'un katı bir çift sayı değildir.");

    }
    }
