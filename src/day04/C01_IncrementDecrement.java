package day04;

public class C01_IncrementDecrement {
    public static void main(String[] args) {

        int sayi = 10;
        sayi ++;//11

        System.out.println(sayi);//11

        System.out.println(sayi++);
        System.out.println(sayi);

        System.out.println("======================");

        int sayi2 =21;

        ++sayi2;
        System.out.println(sayi2);//22

        System.out.println(++sayi2);//23
        System.out.println(sayi2);//23

        int sayi3 = 53;

        sayi3 *=2;
        System.out.println(sayi3);//106

        sayi3 /=2;
        System.out.println(sayi3);//53

        sayi3 *=sayi3;
        System.out.println(sayi3);//2809

        sayi3--;
        System.out.println(sayi3);//2808
    }
}
