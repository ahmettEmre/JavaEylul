package day02;


import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        //Scanner bizim kullanici ile iletisimimizi saglar

        //1.Adim Scanner kutuphanesşnden bir obje olusturalim
        Scanner eylul = new Scanner(System.in);

        //2.Adim Kullaniya bir mesaj verelim
        System.out.println("Lutfen bize bir sayi veriniz");

        //3.Adim Kullanicin verdigi degeri iceriye alalim
        int sayi1= eylul.nextInt();

        System.out.println(sayi1);

    }
}
