package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayDemo {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Peter");
        list.add("Paul");

        System.out.println(list);


        Set<String> set = new HashSet<>();
        set.add("sex");
        set.add("drop");

        Scanner in = new Scanner(System.in);
        String next = in.next();

        if(set.contains(next.toLowerCase())) {
            System.out.println("next leve");
        } else {
            System.out.println("next up");
        }
    }

}
