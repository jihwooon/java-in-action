package Ch2;


/**<p>
 * 평면에 놓인 점을 기술하는 불변 클래스 Point를 구현하라 <br>
 * 특정 점으로 설정하는 생성자와 원점으로 설정하는 인수없는 생성자, getX, geyY, translate, scale 메서드를 구하라.<br>
 * translate 메서드는 x와 y 방향으로 주어진 길이만큼 점을 옮긴다. scale 메서드는 주어진 비율로 두 좌표의 크기를 조절한다. <br>
 * 결과로 새로운 점을 반환하도록 이 메서드들을 구현하라. 예를 들어 다음 문장 p를 (2, 3.5)좌표에 있는 점으로 설정해야 한다. <br>
 * <br>
 * Point p = new Point(3, 4).translate(1, 3).scale(0.5);

 * <p/>
 * */
public class Ch2_5 {

    public static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        
    }

    public static void main(String[] args) {

    }
}
