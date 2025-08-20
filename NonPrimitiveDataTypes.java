class Student {
    int id;
    String name;
}

public class NonPrimitiveDataTypes {
    String name;
    int[] numbers;
    int value;
    Student s;

    public static void main(String[] args) {

        NonPrimitiveDataTypes npdt = new NonPrimitiveDataTypes();

        // checking default values of non primitive data types => null
        System.out.println("default value of string : " + npdt.name);
        System.out.println("default value of array : " + npdt.numbers);
        System.out.println("default value of string : " + npdt.name);
        System.out.println("default value of class : " + npdt.s);

        // checking default values of primitive data types => 0
        System.out.println("Default vale of int" + npdt.value);

        // This is how we will validate non primitive data types to avoid nullpointer
        // exception
        if (npdt.name != null) { // validating the String before accessing.
            System.out.println(npdt.name);
        }
    }
}
