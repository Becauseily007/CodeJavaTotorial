public class StringMethods {
    public static void main(String[] args) {
        int stringSize;
        String message = "java is great fun";
        stringSize = message.length();
        String upper = message.toUpperCase();
        String lower = message.toLowerCase();
       char letter = message.charAt(3);
        System.out.println(upper);
        System.out.println(lower);
        
        System.out.println(letter);
        System.out.println(" java " +stringSize+ "is great fun");
    }
}
