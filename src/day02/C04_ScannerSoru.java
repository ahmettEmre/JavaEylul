package day02;

import java.util.Scanner;

public class C04_ScannerSoru {
    public static void main(String[] args) {

        // Kullanicidan ismini alin
        // ve girilen ismi buyuk harflerle yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bana isminizi girin");
        String isim = scan.next();

        System.out.println(isim.toUpperCase());
    }
}
