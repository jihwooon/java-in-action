/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package core;

public class
ArrayExample {

    public static void main(String[] args) {
        String[] names = new String[100];

        for (int i = 0; i < names.length; i++) {
            names[i] = "";
            System.out.println("names : " + names);
            System.out.println("nameSize : " + names.length);
        }
    }
}