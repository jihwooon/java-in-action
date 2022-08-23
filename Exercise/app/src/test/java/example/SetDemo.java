package example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        // 집합
//        Set<String> badWords = new HashSet<>();
//        badWords.add("java");
//        badWords.add("drugs");
//        badWords.add("c++");
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please choose a user name: ");
//        String username = in.next();
//        if(badWords.contains(username.toLowerCase())) {
//            System.out.println("Please choose a different user name");
//        } else {
//            System.out.println("Registered " + username + "since it wasn't one of " + badWords);
//        }


        //반복자
        Collection<String> coll = new ArrayList<>();
        coll.add("Peter");
        coll.add("Paul");
        coll.add("Mary");
        Iterator<String> iter = coll.iterator();

        while(iter.hasNext()) {
            String element = iter.next();
            process(element);
        }

        iter = coll.iterator();
        while (iter.hasNext()) {
            String element = iter.next();
            if(element.startsWith("M")) {
                iter.remove();
            }
        }

        coll.removeIf(e -> e.endsWith("r"));

        for (String element: coll) {
            process(element);
        }
    }
    public static void process(String e) {
        System.out.println("Processing " + e);
    }
}
