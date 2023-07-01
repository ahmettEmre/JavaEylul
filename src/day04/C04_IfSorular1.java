package day04;

import java.util.Scanner;

public class C04_IfSorular1 {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin, girdigi sayi 5 e tam bolunebiliyorsa, "Bu sayi 5 in katidir" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int girilenSayi=scan.nextInt();

        if (girilenSayi%5==0){
            System.out.println("Bu sayi 5 in katidir");
        }else {
            System.out.println("Sayi 5 in kati degil");
        }
    }
}
