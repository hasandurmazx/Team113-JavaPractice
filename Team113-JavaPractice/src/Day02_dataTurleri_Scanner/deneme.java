package Day02_dataTurleri_Scanner;

public class deneme {

    public static void main(String[] args) {
        String input1 = "15.30 €";
        String input2 = "11.40 €";
        String output = toplamFiyat(input1, input2);
        System.out.println(output);
    }

    public static String toplamFiyat(String input1, String input2) {
        double fiyat1 = Double.parseDouble(input1.split(" ")[0]);
        double fiyat2 = Double.parseDouble(input2.split(" ")[0]);
        double toplamFiyat = fiyat1 + fiyat2;
        return String.format("%.2f €", toplamFiyat);
    }
}

