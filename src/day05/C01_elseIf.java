package day05;

import java.util.Scanner;

public class C01_elseIf {
    public static void main(String[] args) {
        /*
        Ogrencinin notu 85 ve ustu ise AA,
        (85 ve ustu degilse) 65 ve ustu ise BB,
        (65 ve ustu de degilse) 50 ve ustu ise CC,
        (geriye kalanlar) DD
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not = scan.nextDouble();

        if (not >=85 && not <=100) System.out.println("AA");
        else if (not>=65 && not <=100) System.out.println("BB");
        else if (not>=50 && not <=100) System.out.println("CC");
        else if (not >= 0 && not <=100) System.out.println("DD");
        else System.out.println("Gecersiz Not");

    }
}
