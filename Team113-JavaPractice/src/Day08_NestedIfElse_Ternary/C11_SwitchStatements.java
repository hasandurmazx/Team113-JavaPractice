package Day08_NestedIfElse_Ternary;

import java.util.Scanner;

public class C11_SwitchStatements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lufen bir harf giriniz");
        char harf=scan.next().charAt(0);

        harf= Character.toUpperCase(harf);

        if (harf=='P') {
            System.out.println("Pazartesi,Pazar veya Persembe");
        } else if (harf=='S') {
            System.out.println("SAli");
        } else if (harf=='C') {
            System.out.println("Carsamba, Cuma veya Cumartesi");
        }else{
            System.out.println("Gecersiz harf");

        }
        System.out.println("============================");
        // daha duzenli ve kullanisli olarak switch kullanabiliriz
        // switch statements, switch'in onunde yazilan degiskene esit olan case'i calistirir
        // calismaya basladiktan sonra
        // break gorunceye kadar veya switch'in sonuna kadar calisir

        switch (harf){

            case 'P':
                System.out.println("Pazartesi,Pazar veya Persembe");
                break;

            case 'S':
                System.out.println("SAli");
                break;

            case 'C' :
                System.out.println("Carsamba, Cuma veya Cumartesi");
                break;

            default:
                System.out.println("Gecersiz harf");



        }

    }
    }




