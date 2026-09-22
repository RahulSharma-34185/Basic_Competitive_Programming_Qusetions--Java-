package Strings;

public class StringSearch {
    public static void main(String[] args) {
        
        String text = "Data structure and algorithm";
        int index = text.indexOf("Algorithm");
        System.out.println("Index of Algorithm : "+ index);
        System.out.println("Contains 'Data'? "+ text.contains("Data"));
        System.out.println("Starts with 'Data'? " + text.startsWith("Data"));
        System.out.println("Ends with 'ms'? "+ text.endsWith("ms"));

    }
    
}
