class StringBufferExample {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("hello");
        System.out.println("StringBuffer sb: " + sb);

        // Append method
        sb.append("World !!!");
        System.out.println("After append : " + sb);

        // getting length
        System.out.println("length : " + sb.length());

        // total allocated capacity
        System.out.println("total capacity : " + sb.capacity());

        // chatAt
        System.out.println("chat At 5 : " + sb.charAt(5));

        // removing at specific character
        System.out.println("remove char at 12 - 15 : " + sb.delete(12, 15));

        // removing character at specific index
        System.out.println("deleted char at 1 : " + sb.deleteCharAt(1));

        // Ensuring capacity increasing capacity to 100
        sb.ensureCapacity(100);

        System.out.println("capcitiy after increasing : " + sb.capacity());
        System.out.println("total capacity : " + sb.capacity());

        // inserting at specific position
        sb.insert(0, "Welcome Brother ! ");

        sb.reverse();
        System.out.println("Sb after reversing : " + sb);

        sb.replace(12, 17, "replace");
        System.out.println("sb after replace : " + sb);

    }
}
