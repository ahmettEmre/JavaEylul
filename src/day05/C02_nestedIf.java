package day05;

import java.util.Scanner;

public class C02_nestedIf {
    public static void main(String[] args) {
        /*
        Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Cinsiyetinizi ve yaşınızı giriniz:");
        String cinsiyet = scan.next();
        int yas = scan.nextInt();

        if (cinsiyet.equals("kadin")){
            if (yas<18) System.out.println("geçersiz yaş");
            else if (yas>=60) System.out.println("emekli olabilirsiniz");
            else System.out.println((60-yas) + " yıl içinde emekli olabilirsiniz");

        } else if (cinsiyet.equals("erkek")) {
            if (yas<18) System.out.println("geçersiz yaş");
            else if (yas>=65) System.out.println("emekli olabilirsiniz");
            else System.out.println((65-yas) + " yıl içinde emekli olabilirsiniz");

        }else{
            System.out.println("geçersiz cinsiyet");
        }

    }
}
