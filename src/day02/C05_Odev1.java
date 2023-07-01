package day02;

import java.util.Scanner;

public class C05_Odev1 {
    public static void main(String[] args) {

        //Soru 1 - Kullanicidan bir double, bir int sayi alip bunlarin toplamini ve carpimini yazdirin


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1= scan.nextDouble();
        int sayi2 = scan.nextInt();

        double toplam = sayi1 + sayi2;
        double carpim = sayi1 * sayi2;

        System.out.println("Sayilarin toplami : "+ toplam +
                "\nSayilarin carpimi : "+ carpim);

    }
}
