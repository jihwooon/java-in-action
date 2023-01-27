package Ch1;

/*
 * double 타입인 양수 값 중 가장 작은 값과 큰 값을 출력하는 프로그램을 작성하라
 * (자바 API에서 Math.nextUp을 찾는다.)
 * */
public class Ch1_4 {
    public double MIN_VALUE() {
        double minValue = Double.MIN_VALUE;

        return Math.nextUp(minValue);
    }

    public double MAX_VALUE() {
        double maxValue = Double.POSITIVE_INFINITY;

        return Math.nextDown(maxValue);
    }
}
