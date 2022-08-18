package Ch1;

/*
 * 1.5.3 문자열 비교에는 s.equals(t)이지만 s!=t인 두 문자열 s 와 t를 비교하는 예제가 있다.
 * substring을 사용하지 않는 다른 예를 제시하라.
 */

public class Ch1_9 {

    public boolean solution(String s, String t) {

        if (s.equals(t)) {
            System.out.println("s.equals(t) : " + s.equals(t));
            return true;
        }

        return false;
    }

    public boolean solution1(String s, String t) {
        if (s == t) {
            System.out.println("s == t : " + s == t);
            return true;
        }
    
        return false;
    }
}
