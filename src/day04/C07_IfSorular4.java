package day04;

import java.util.Scanner;

public class C07_IfSorular4 {
    public static void main(String[] args) {
        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üçgeninizin kenarlarını giriniz:");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        if (kenar1==kenar2 && kenar1==kenar3 && kenar2==kenar3){
            System.out.println("Girmiş olduğunuz üçgen bir eşkenar üçgendir.");
        }else{
            System.out.println("Girmiş olduğunuz üçgen eşkenar üçgenden farklı bir üçgendir.");
        }



    }
}
