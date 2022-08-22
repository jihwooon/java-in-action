package example;

public class Computer {

    int sum(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum;
    }

    int sum1(int ... values) {
        int sum = 0;
        for(int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        Computer computer = new Computer();
        int result = computer.sum1(new int[]{1, 2, 3});

        System.out.println("computer : " + result);

    }
}
