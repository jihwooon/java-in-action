package example;

/**
 * 실수형 x와 정수형 y가 주어졌을 때 x^y를 계산하는 프로그램을 작성하라. 오버플로와 언더플로는 무시해도 좋다.
 * x^2 = x^1 X x,
 * x^3 = x^2 X x
 * x^4 = x^3 X x
 * x^5 = x^4 X x
 * x^y = x^(y-1) X x
 * */
public class Power1 {

    public double result(double x, double y) {
        if(y == 0) {
            return 1;
        }

        return x * result(x, y -1);
    }

}
