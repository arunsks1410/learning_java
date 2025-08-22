class StringExample {
    public static void main(String[] args) {
        // Class Work
        String s1 = "Arunkumar";
        String s2 = new String("Arunkumar");

        System.out.println("memory check " + s1 == s2);
        System.out.println("values check " + s1.equals(s2));

        String str1 = "Java";
        String str2 = new String("Java");

        String str3 = str2.intern();
        String str4 = "Java";

        String str5 = new String("Javascript").intern();

        System.out.println(str1 == str2);
        System.out.println(str3 == str4);
        System.out.println(str5 == "Javascript");

    }
}
