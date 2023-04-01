package day09_SwitchStatement_StringManipulatoins;

public class C07_charAt {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.charAt(0)); // J

        // bastan 6. harfi yazdirin

        System.out.println(str.charAt(5)); // C

        // sondan 2. harfi yazdirin

        System.out.println(str.charAt(11 - 2)); // i

        // son harfi yazdirin

        System.out.println(str.charAt(11 - 1)); // r

        // System.out.println(str.charAt(11)); // StringIndexOutOfBoundsException

        // System.out.println(str.charAt(15)); //StringIndexOutOfBoundsException

        /*
        Java'da iki turlu hata ile karsilasabiliriz
        1- syntax olarak hatali yazilan kodlarin Java compile ederken anlar ve altini kirmizi cizer
            str=23; String bir variable'a int deger atanamayacagini bilir ve altini kirmizi cizer\
            CompileTimeError (CTE) diyoruz

        2- Bazende syntax'te hata olmaz
            Java sorun calismaya basladiktan sonra farkeder
            str.charAt(15 : burada verilen str'den bir karakter isteniyor
            compile time'de str'in uzunlugunu Java anlamaz
            ama calisinca 15.index'in olmadigini farkeder ve exception firlatir
            RunTimeError (RTE) deriz
         */


    }
}
