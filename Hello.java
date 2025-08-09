// 1:17:49
public class Hello {
    public static void main(String[] args) {
        byte a = 127;
        System.out.println(a);

        int b = 230;
        System.out.println(b);

        b = a; // inplicit conversion also called (conversion)
        System.out.println(b);

        int m = 300;

        byte n = (byte) m; // Explicit conversion (casting)

        System.out.println(n); // 44 => 300 % 256(byte total value)
    }
}
