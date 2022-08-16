package Ch1;

/*
 * int의 최대값보다 큰 double를 int 타입으로 변환하면 무슨 일이 일어나는가? 직접 시도해보라
*/
public class Ch1_5_Ex {

    public static void main(String[] args) {

        double x = 1.0 + Integer.MAX_VALUE;
        System.out.printf("Double 1.0 + Integer.MAX_VALUE %g as int %d Integer.MAX_VALUE %d\n", x, (int) x, Integer.MAX_VALUE);

        double y = 2000000000.0 + Integer.MAX_VALUE;
        System.out.printf("Double 2000000000.0 + Integer.MAX_VALUE %g as int %d Integer.MAX_VALUE %d\n", y, (int) y, Integer.MAX_VALUE);

    }
}
