package Ch1;

/*
 * 0~4294967295 사이의 두 개를 읽어서 int 변수에 저장한 후 부호 없는 합계, 차이, 곱, 몫, 나머지를 계산해 표시하는 프로그램을 작성하라.
 * (long 값으로 변환하지 않아야 한다.)
 */
public class Ch1_7 {

    public int solution_sum(int x, int y) {
        int answer = 0;

        answer = x + y;
        System.out.println("answer + : " + answer);

        return answer;
    }

    public int solution_difference(int x, int y) {
        int answer = 0;

        answer = x - y;
        System.out.println("answer - : " + answer);

        return answer;
    }

    public int solution_quotient(int x, int y) {
        int answer = 0;

        answer = x / y;
        System.out.println("answer / : " + answer);

        return answer;
    }

    public int solution_multiply(int x, int y) {
        int answer = 0;

        answer = x * y;
        System.out.println("answer * : " + answer);

        return answer;
    }

    public int solution_remainder(int x, int y) {
        int answer = 0;

        answer = x % y;
        System.out.println("answer % : " + answer);

        return answer;
    }

}
