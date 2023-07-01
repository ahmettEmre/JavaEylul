package day04;

public class C03_IfStatements {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if (a>b){
            System.out.println("a, b den buyuk");
        }
        else {
            System.out.println("a, b den buyuk degil");
        }

        String isim = "ahmet";
        int yas = 19;
        isim = isim + " = " + yas;
        System.out.println( isim + " = " + yas);
        System.out.println(isim);

    }
}
