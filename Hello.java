// 1:17:49
public class Hello {
    public static void main(String[] args) {

        /*
         * byte Stores whole numbers from -128 to 127
         * short Stores whole numbers from -32,768 to 32,767
         * int Stores whole numbers from -2,147,483,648 to 2,147,483,647
         * long Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         * float Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
         * double Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
         * boolean Stores true or false values
         * char Stores a single character/letter or ASCII values
         */

        byte a = 127;
        System.out.println(a);

        int b = 230;
        System.out.println(b);

        b = a; // implicit conversion also called (conversion)
        System.out.println(b);

        int m = 300;

        byte n = (byte) m; // Explicit conversion (casting)

        System.out.println(n); // 44 => 300 % 256(byte total value)
    }
}
