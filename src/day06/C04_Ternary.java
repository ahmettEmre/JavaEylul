package day06;

import java.util.Scanner;

public class C04_Ternary {

    // Soru 4- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
    //        kucukse “Maalesef kaldin” yazdirin.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Notunuzu girin");
        double not = input.nextDouble();

        System.out.println(not >= 50 ? "Sinifi Gectin " : "Maalesef kaldin" );

    }
}
