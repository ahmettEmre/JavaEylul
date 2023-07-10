package day06;

import java.util.Scanner;

public class C06_SwitchStatements {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan ISTQB kisaltmasindan hangi harfin anlamini ogrenmek istedigini alin
        //ve girilen harfin karsiligini yazdirin.
        //I : International S : Software T : Testing Q : Qualifications B: Board

        Scanner scan = new Scanner(System.in);
        System.out.println("Harfi giriniz");
        char harf = scan.next().charAt(0);

        switch (harf){
            case 'I':
            case 'i':
                System.out.println("International");
                break;
            case 'S':
            case 's':
                System.out.println("Software");
                break;
            case  'T':
            case  't':
                System.out.println("Testing");
                break;
            case  'Q':
            case  'q':
                System.out.println("Qualifications");
                break;
            case 'B':
            case 'b':
                System.out.println("Board");
                break;
            default:
                System.out.println("Gecersiz harf");
        }
    }
}
