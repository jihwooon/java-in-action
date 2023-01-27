package Ch1;


/*
 * 정수(양의 정수 또는 음의 정수)로 된 각도를 읽고 0 ~ 359도 사이의 값으로 정규화하는 프로그램을 작성하라
 * (먼저 % 연산자를 사용한 후 floorMod 메서드를 이용해서 작성한다.)
 * */
public class Ch1_2 {
    public int solution(int position) {

        return Math.floorMod(position, 360);
    }

    public int solution1(int position) {

        return position % 360;
    }
}
