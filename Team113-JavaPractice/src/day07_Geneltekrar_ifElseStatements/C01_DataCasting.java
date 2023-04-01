package day07_Geneltekrar_ifElseStatements;

public class C01_DataCasting {

    public static void main(String[] args) {

        // Java'da bazi data turleri asla baska data turune cevrilemez

        /*
        String str= false;
        String str = 20;
        boolean bl = 'a';
        int sayi1= "merhaba";
         */

        // ozellikle sayisal data turundeki degerler,
        // baska sayisal data turundeki variable'lara atanabilir

        double db1 = 23;
        short sh1 = 12;

        int sayi1 = sh1;

        // daha dar data turundeki degeri, daha genis data turundeki variable,a atamaya
        // autowidening denir ve java bunu otomatik yapar

        sh1 = (short) sayi1;
        sayi1 = (int) db1;

        // daha genis data turundeki degeri, daha daha data turundeki variable,a atamaya
        // ecplicit denir ve java bunu otomatik yapmaz ve bizden onay ister

        sayi1 = 'k';

        if (sayi1 > 'd') {
        }
        // cahr data turundeki degerler, sayisal islemlerde kullanilabilir
        // bir char matematiksel islemde kullanilirsa ASCII table'daki degeri ile isleme girer

        System.out.println('k' + 1); // 108
        // eger bu islemin char olarak degerini yazdirmak istersek
        // sayisal degerler char'a cast edilebilir

        System.out.println((char) ('k' + 1)); // l

        db1 = 4935843568d;
        int sayi2 = (int) db1;
        System.out.println("sayi2 : " + sayi2); // sayi2 : 2147483647


        short sh2 = (short) db1;
        System.out.println("sh2 : " + sh2); // sh2 : -1


        String str5 = "112";

        short sh3 = Short.parseShort(str5);

        System.out.println("sh3 un iki kati : " + sh3 * 2); // sh3 un iki kati : 224


    }
}
