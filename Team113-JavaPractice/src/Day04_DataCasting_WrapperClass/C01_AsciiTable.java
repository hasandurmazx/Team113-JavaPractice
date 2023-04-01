package Day04_DataCasting_WrapperClass;

public class C01_AsciiTable {

    public static void main(String[] args) {
        /*
        24 ==> 11000
        a ===>  97 ==> 10100010
        b ==> 98

        ahmet
         */

        // char data turundeki variable ve degerler
        // sayisal data turleri ile karsilasirsa veya turlerine atanirsa
        // veya sayisal data turundeki datalarla isleme sokulursa
        // ascii table'daki degerleri ile isleme girer

        System.out.println(5 + 'a'); //102

        char ilkHarf = 101;

        System.out.println(ilkHarf); // e

        // kullanicinin verdigi harften bir sonraki harfi yazdirin

        char girilenchr = 'f';

        System.out.println(girilenchr + 1);  // 102 + 1 = 103
        // biz 103'u degil, 103'un karsiligi olan char ifadeyi yazdirmak istersek explicit casting yapariz

        System.out.println("Gririlen harfin bir sonrasi : " + (char) (girilenchr + 1)); // g

        // verilen bir harften 2 onceki harfi yazdirin

        girilenchr = 'M';

        System.out.println(girilenchr - 2); // 77-2=75

        System.out.println("girilen harfin 2 oncesi : " + (char) (girilenchr - 2)); // K

    }
}
