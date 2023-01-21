public class Strings {
    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer("StringBuffer Object");
        StringBuilder sBuilder = new StringBuilder("StringBuilder Object");

        String s = new String("not a stringbuffer or stringbuilder object.");
//        System.out.println(s.contains("not"));
//        System.out.println(s.startsWith("not"));
//        System.out.println(s.startsWith("stringbuilder"));

        System.out.println(s.toUpperCase());

        //replaceAll() does not modify the original string.
        System.out.println(s.replaceAll(".","*"));
        //Value of the actual string remains the same.
        System.out.println(s);

        Integer x = 12;
        System.out.println(x.toString());
    }

}
