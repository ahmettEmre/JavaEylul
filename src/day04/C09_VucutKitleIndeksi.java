package day04;

import java.util.Scanner;

public class C09_VucutKitleIndeksi {
    public static void main(String[] args) {

         /*Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        zayif yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu ve boyunuzu giriniz:");

        int kilo1 =scan.nextInt();
        String kilo2 = "Kilonuz: " + kilo1;

        int boy1 = scan.nextInt();
        String boy2 = "Boyunuz: " + boy1;

        System.out.println(kilo2);
        System.out.println(boy2);

        int endeks = (kilo1*10000)/(boy1*boy1);

        if (endeks>30){
            System.out.println("Obez");
        }
        else if (endeks<30 & endeks>25) {
            System.out.println("Kilolu");
        } else if (endeks<=25 & endeks>20) {
            System.out.println("Normal");
        }
        else{
            System.out.println("Zayıf");
        }

    }
}
