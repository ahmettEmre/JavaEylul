package day04;

import java.util.Scanner;

public class C08_IfSorular5 {
    public static void main(String[] args) {
        //Kullanicidan notunu alin, eger notu 50 den buyuk ise "Gectin" degilse "Kaldin" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz:");
        int not = scan.nextInt();

        if (not>=50){
            System.out.println("Geçtin");
        }
        else{
            System.out.println("Kaldın");
        }
    }
}
