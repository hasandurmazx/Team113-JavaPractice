package Day08_NestedIfElse_Ternary;

public class C06_TErnary {

    public static void main(String[] args) {

        int sayi = 20;

        System.out.println(sayi % 2 == 0 ? "sayi cift" : "sayi tek");
        String sonuc = sayi % 2 == 0 ? "sayi cift" : "sayi tek";

        System.out.println(sayi % 2 == 0 ? "sayi cift" : 2 * sayi);

       // int sonuc2 = sayi % 2 == 0 ? "sayi cift" : 2 * sayi;

    }
}
