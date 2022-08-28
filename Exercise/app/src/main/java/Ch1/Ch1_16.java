package Ch1;

public class Ch1_16 {

    public static double average(double ...values) {
        double sum = 0;
        for(double v : values) sum += v;

        return values.length == 0 ? 0 : sum / values.length;
    }

    public static double max(double first, double... rest) {
        double result = first;
        for(double d: rest) {
            result += d;
        }

        return result / (rest.length + 1);
    }

    public static void main(String[] args) {
        double avg = average(3, 4.5, -5, 0);
        System.out.println("avg = " + avg);

        double max = max(4, 3, 4.5, -5, 0);
        System.out.println("max = " + max);
    }
}
