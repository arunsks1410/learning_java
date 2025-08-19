public class PrimitiveDataType {
    int i;
    byte b;
    short s;
    char c;
    long l;
    float f;
    boolean bool;

    public static void main(String[] args) {

        System.out.println(
                "Interger size : " + Integer.SIZE + " Interger Min_val " + Integer.MIN_VALUE + " Interger Max_val"
                        + Integer.MAX_VALUE);
        System.out.println("byte size : " + Byte.SIZE + " Byte Min_val " + Byte.MIN_VALUE + " Byte Max_val"
                + Byte.MAX_VALUE);
        System.out.println("short size : " + Short.SIZE + " short Min_val " + Short.MIN_VALUE + " Interger Max_val"
                + Short.MAX_VALUE);
        System.out.println("long size : " + Long.SIZE + " long Min_val " + Long.MIN_VALUE + " long Max_val"
                + Long.MAX_VALUE);
        System.out.println("Float size : " + Float.SIZE + " float Min_val " + Float.MIN_VALUE + " Interger Max_val"
                + Float.MAX_VALUE);

        PrimitiveDataType pdt = new PrimitiveDataType();
        System.out.println("default value of int " + pdt.i);
        System.out.println("default value of byte " + pdt.b);
        System.out.println("default value of short" + pdt.s);
        System.out.println("default value of char " + pdt.c);
        System.out.println("default value of long" + pdt.l);
        System.out.println("default value of float" + pdt.f);
        System.out.println("default value of boolean" + pdt.bool);

    }
}
