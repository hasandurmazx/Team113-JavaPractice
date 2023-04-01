package Day03_scanner_DataCasting;

public class C06_ExplicitNarroving {

    public static void main(String[] args) {

        double db1=45.32;

        int in1= (int)db1; // int <=== double

        System.out.println(in1); // 45 ondalikli kismi atti

        db1= 459456854;

        in1=(int)db1; //45
        System.out.println(in1); // 546755656

        in1=34;

        byte by1= (byte)in1; // byte<=== int -128 ---- 127

        System.out.println(by1); // 34

        in1=130; // -126

        by1= (byte) in1;

        System.out.println(by1); // -126


    }
}
