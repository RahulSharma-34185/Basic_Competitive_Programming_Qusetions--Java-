package Strings;
import java.util.*;

public class StringBuilderdemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append("Programming");
        System.out.println("After Append: "+ sb);
        sb.insert(5, "Language");
        System.out.println("After insert: "+ sb);
        sb.replace(0, 4, "C++");
        System.out.println("After replace: "+ sb);
        sb.delete(0, 3);
        System.out.println("After delete: "+ sb);
        sb.reverse();
        System.out.println("After reverse: "+ sb);

    }
    
}
