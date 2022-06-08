package core;

import java.util.ArrayList;

public class ArrayWrapperClassExample {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        int first = numbers.get(0);

        System.out.println("first : " + first);
    }
}
