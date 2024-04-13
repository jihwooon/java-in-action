package org.example;

import java.util.function.Function;

public class CallByArrowFunction {

    public static void main(String[] args) {
        // let helloWorldJs = name => 'hello', " + name + "!"
        // let resultJs = helloWorldJs("Ben");

        Function<String, String> helloWorldJv = (name) -> "hello, " + name + "!";
        var result = helloWorldJv.apply("Ben");

        System.out.printf("result :" + result);
    }
}
