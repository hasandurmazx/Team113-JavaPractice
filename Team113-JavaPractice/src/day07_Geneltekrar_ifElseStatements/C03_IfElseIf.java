package day07_Geneltekrar_ifElseStatements;

import java.util.Scanner;

public class C03_IfElseIf {

    public static void main(String[] args) {
        // Kullanicidan pozitif bir tam sayi alin
        // sayi 3 ile bolunuyorsa "3'un kati"
        // sayi 5 ile bolunuyorsa "5'in kati"
        // sayi hem 3 hemde 5 ile bolunuyorsa "3 ve 5'in kati"
        // ikisine de bolunuyorsa "ne 3'un ne de 5'in kati" yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen sayi giriniz ");

        int sayi = scan.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0) {
            System.out.println("3'un ve 5'in kati");
        } else if (sayi % 5 == 0) {
            System.out.println("5'in kati");
        } else if (sayi % 3 == 0 ) {
            System.out.println("3'un  kati");
        }else{
            System.out.println("ne 3'un ne de 5'in kati");

        }
    }
}
