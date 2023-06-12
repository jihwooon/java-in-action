package basic.java.loop;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopExample {

    public static void main(String[] args) {
//        int count = 0;
//        int sum = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        count = scanner.nextInt();
//        sum = scanner.nextInt();
//
//        if(count > 0) {
//            double average = sum / count;
//            System.out.println("average : " + average);
//        }

        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add(1,"2");
        list.add(1,"3"); // IndexOutOfBoundsException 발생
        list.add(1,"4"); // IndexOutOfBoundsException 발생

        System.out.println("list = " + list);
    }

}
