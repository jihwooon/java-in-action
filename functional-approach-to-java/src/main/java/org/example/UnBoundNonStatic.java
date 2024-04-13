package org.example;

import java.util.Locale;
import java.util.function.Function;

public class UnBoundNonStatic {

    public static void main(String[] args) {
        Function<String, String> toLowerCaseLambda = str -> str.toLowerCase();
        String result = toLowerCaseLambda.apply("ABC");

        System.out.println(result);

        Function<String, Locale> newLocaleLambda = language -> new Locale(language);
        Locale korea = newLocaleLambda.apply("korea");

        System.out.println(korea);
    }
}
