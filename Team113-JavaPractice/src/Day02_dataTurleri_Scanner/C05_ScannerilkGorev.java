package Day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_ScannerilkGorev {

    public static void main(String[] args) {
        // kullanicidan bir sayi alin
        // ve sayinin karesini yazdirin

        Scanner scan= new Scanner(System.in);

        double sayi= scan.nextDouble();

        System.out.println("Sayinin karesi : " + sayi*sayi);
    }
}
