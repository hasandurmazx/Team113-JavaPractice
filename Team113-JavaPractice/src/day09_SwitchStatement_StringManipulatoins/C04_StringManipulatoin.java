package day09_SwitchStatement_StringManipulatoins;

import java.util.Locale;

public class C04_StringManipulatoin {

    public static void main(String[] args) {
        String str =  "Java Candir";

        // str'i buyuk harf olarak yazdirin

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // Java Candir

        // String manipulatoin yaptiktan sonra, asil variable'a atmaa yapilmazsa
        // asil variable degismez.

        str = str.toUpperCase();
        System.out.println(str); // JAVA CANDİR

        str = str.toLowerCase();
        System.out.println(str); // java candir

        // str'i turkce karakterleri gozonunde bulundurarak kucuk harflerle yazdirin

        str= str.toLowerCase(Locale.forLanguageTag("TR"));
        System.out.println(str); // java candir // turkce yazdirdin




    }
}
