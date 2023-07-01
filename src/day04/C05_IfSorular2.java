package day04;

import java.util.Scanner;

public class C05_IfSorular2 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin, sayi 3 e bolunuyorsa "Sayi 3 e bolunebilen bir sayi",
        //5 e bolunuyorsa "Sayi 5 e bolunebilen bir sayi" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi%3==0){
            System.out.println("Sayi 3 e bolunebilen bir sayi");
        }else {
            System.out.println("Sayi 3 e bolunebilen bir sayi degil");
        }

        if (sayi%5==0){
            System.out.println("Sayi 5 e bolunebilen bir sayi");
        }else {
            System.out.println("Sayi 5 e bolunebilen bir sayi degil");
        }

    }
}
