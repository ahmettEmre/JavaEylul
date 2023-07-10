package day06;

import java.util.Scanner;

public class C05_SwitchStatements {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir rakam alip, rakami yaziyla yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir rakam girin");
        int rakam = input.nextInt();

        switch (rakam){
            case 0 :
                System.out.println("sıfır");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            default:
                System.out.println("Gecersiz");
        }
    }
}
