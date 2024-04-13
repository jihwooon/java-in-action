package org.example;

import java.util.function.Function;

public class SubClass extends SuperClass {

    @Override
    public String doWork(String input) {
        return "this: " + input;
    }

    public void superAndThis(String input) {
        Function<String, String> thisWorker = this::doWork;
        var thisResult = thisWorker.apply(input);
        System.out.println(thisResult);

        Function<String, String> superWork = SubClass.super::doWork;
        String superResult = superWork.apply(input);
        System.out.println(superResult);
    }

    public static void main(String[] args) {
        new SubClass().superAndThis("hello World");
    }
}
