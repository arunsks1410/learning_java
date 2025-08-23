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

        // Interview experience
        String name = "Arunkumar";
        System.out.println("original string : " + name);
        System.out.println("first occurence of r : " + name.indexOf("r"));
        System.out.println("first occurence of kumar : " + name.indexOf("kumar"));

        System.out.println("last occurence of u : " + name.lastIndexOf("u"));

        System.out.println("replace m -> w : " + name.replace("m", "w"));

        String languages = "Tamil,Hindi,Telugu,Urudu,Malayalam";
        String[] lang = languages.split(",");
        System.out.println("splitted string : ");
        for (String language : lang) {
            System.out.println("language : " + language);
        }
        // System.out.println("lang : " + lang);

        // System.out.println("split in console : " + languages.split(","));

        String location = "    bangalore    ";
        System.out.println("location : " + location);
        System.out.println("location trim : " + location.trim());

        // Class Work
        String state = "Tamilnadu";
        String city = "Salem";
        System.out.println("state  : " + state + "city : " + city);
        System.out.println("Char At 3 : " + state.charAt(3));
        System.out.println("Sub String : 5 - 9 : " + state.substring(5, 9)); // nadu
        System.out.println("concat : " + state.concat(city));

        // HomeWork
        String color = "sky blue";
        char[] result = color.toCharArray();
        for (char ch : result) {
            System.out.println("ch : " + ch);
        }
        // System.out.println(result);

        System.out.println(state.contains("Tamil"));

        String fileName = "IMG_12345hplap.jpg";
        System.out.println(fileName.startsWith("IMG_") && fileName.endsWith(".jpg"));

    }
}
