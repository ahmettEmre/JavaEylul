package day06;

import java.util.Scanner;

public class C07_SwitchOdev {
    public static void main(String[] args) {

        // Kullanicidan gun numarasini alin
        // hafta ici veya hafta sonu oldugunu yazdirin

        Scanner sc = new Scanner(System.in);
        System.out.println("Gun numarasını girin");
        int rakam = sc.nextInt();

        switch (rakam){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Haftaici");
                break;
            case 6:
            case 7:
                System.out.println("Haftasonu");
                break;
                default:
                    System.out.println("Gecersiz rakam");

        }
    }
}
