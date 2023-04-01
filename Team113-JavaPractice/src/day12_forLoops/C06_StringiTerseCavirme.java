package day12_forLoops;

public class C06_StringiTerseCavirme {

    public static void main(String[] args) {
        // (interview) - Kullanicidan bir String isteyin
        //              ve String'i tersine cevirip kaydedin.

        String input ="TalaT";

        // output : ridnaC avaJ

        String output="";

        for (int i = input.length()-1; i >=0; i--) {

            output += input.charAt(i);

        }
        System.out.println(output);

    }
}
