package Datatypes;

public class Fifth {
    public static void main(String[] args) {
        byte a = 127;
        int b = 257; //257%256(256 is number of values in byte)
        a = (byte)b;
        System.out.println(a);
        int c = 100;
        byte d = (byte)c;
        System.out.println(d);

        float e = 12.76f;
        int f = (int)e;
        System.out.println(f);
    }
}
