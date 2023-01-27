package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayDemo {


    public static void main(String[] args) {
        ArrayList<String> list = getStringArrayList();

        System.out.println(list);

        Set<String> set = getStrings();

        Scanner in = new Scanner(System.in);
        String next = in.next();

        extracted(set, next);
    }

    private static ArrayList<String> getStringArrayList() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Peter");
        list.add("Paul");
        return list;
    }

    private static void extracted(Set<String> set, String next) {
        if(set.contains(next.toLowerCase())) {
            System.out.println("next leve");
        } else {
            System.out.println("next up");
        }
    }

    private static Set<String> getStrings() {
        Set<String> set = new HashSet<>();
        set.add("c++");
        set.add("drop");
        return set;
    }

}
