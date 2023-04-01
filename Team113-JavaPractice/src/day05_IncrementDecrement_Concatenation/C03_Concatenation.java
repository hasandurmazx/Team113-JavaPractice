package day05_IncrementDecrement_Concatenation;

public class C03_Concatenation {

    public static void main(String[] args) {

        // bir String baska bir String veya baska sata turunden bir variable ile
        // + isareti ile birlestirilebilir

    String a="Java";
    String b="Guzeldir";

        System.out.println(a+b);  // JavaGuzeldir

        System.out.println(a+ " " +b); // // Java Guzeldir

        int c=20;
        int d=10;
        System.out.println(a+c+d); // Java2010

        // Eger String ile baska data turundeki bir deger toplanirsa Java sonucu String yapar.

        // Peki Java 30 yazmak istersek

        System.out.println(a+" " +(c+d)); // Java 30

        System.out.println(a+ " " +c*d); // Java 200

        System.out.println(d+c + " " +a); // 30 Java

    }

}
