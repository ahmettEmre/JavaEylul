package day03;

import java.util.Scanner;

public class C03_Modulus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        //sayinin 5 e bolumunden kalan kactir?
        System.out.println(sayi%5);



    }
}
