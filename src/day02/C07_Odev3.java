package day02;

import java.util.Scanner;

public class C07_Odev3 {

    /*
        Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
        asagidaki formmatta yazdirin.

		Isminiz : John
		Soyisminiz : Doe
		Yasiniz : 44
		Kaydiniz basariyla tamamlanmistir.

         */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi girin");
        String isim,soyisim;
        isim = scan.nextLine();
        soyisim = scan.nextLine();
        int yas = scan.nextInt();

        System.out.println("İsminiz : "+ isim +
                "\nSoyisminiz : " + soyisim +
                "\nYasiniz : " + yas +
                "\nKaydiniz basariyla tamamlanmistir.");


    }
}
