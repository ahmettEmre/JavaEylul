package day03;

public class C04_ModulusOdev {
    public static void main(String[] args) {

        //Kullanicidan 4 basamakli bir pozitif tamsayi alip rakamlar toplamini bulun

        int sayi = 3212;

        /*
        int birlerBasamagi = sayi % 10;
        int onlarBasamagi = (sayi/10)%10;
        int yuzlerBasamagi = (sayi/100)%10;
        int binlerBasamagi = (sayi/1000)%10;
        int toplam = birlerBasamagi + onlarBasamagi + yuzlerBasamagi + binlerBasamagi;
        System.out.println(toplam);
        */

        int birlerbasamagi = sayi % 10;
        int toplam=0;
        toplam= toplam + birlerbasamagi;

        sayi=sayi/10;//321.2
        birlerbasamagi=sayi%10;
        toplam= toplam + birlerbasamagi;

        sayi=sayi/10;
        birlerbasamagi=sayi%10;
        toplam= toplam + birlerbasamagi;

        sayi=sayi/10;
        birlerbasamagi=sayi%10;
        toplam= toplam + birlerbasamagi;

        System.out.println(toplam);


    }
}
