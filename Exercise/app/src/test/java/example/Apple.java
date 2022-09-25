package example;

public class Apple {


    public static void process(Runnable r) {
        r.run();
    }

    public static void main(String[] args) {
        process(() -> System.out.println("Hello World")); // 인수가 없으면 void로 실행한다.
    }

}
