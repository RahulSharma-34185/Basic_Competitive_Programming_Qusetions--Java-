package Strings;

public class basics {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String result = str1 +" "+ str2;
        System.out.println("Concated: "+ result);
        System.out.println("Length: "+ result.length());
        System.out.println("char at 1: "+ result.charAt(1));

        System.out.println("Substring (0, 5)" + result.substring(0,5));
        System.out.println("Equals 'Hello World'?"+ result.equals("Hello World"));
    }
    
}
