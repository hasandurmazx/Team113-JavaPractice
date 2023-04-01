package Day08_NestedIfElse_Ternary;

import java.util.Scanner;

public class C04_Ternary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi%2==0) {
            System.out.println("cift sayi");
        }else{
            System.out.println("tek sayi");

        }
    }

}
