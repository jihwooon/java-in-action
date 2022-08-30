package core;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {

        String str = "Hello, World, Java";

        System.out.println("str = " + str);

        boolean hello = str.startsWith("Hello");
        System.out.println("hello = " + hello);

        int i = str.charAt(0) - '0';
        System.out.println("i = " + i);

        String replace = str.replace("Java", "react");
        System.out.println("replace = " + replace);

        String[] split = str.split(", ");
        int length = split.length;
        System.out.println("split = " + Arrays.toString(split));
        System.out.println("length = " + length);


    }
}
