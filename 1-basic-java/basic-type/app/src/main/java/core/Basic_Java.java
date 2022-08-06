package core;

public class Basic_Java {
    public static void main(String[] args) {

        BiNumber biNumber = new BiNumber(2,3);
        System.out.println(biNumber.add());
        System.out.println(biNumber.multiply());
        System.out.println(biNumber.getNumber1());
        System.out.println(biNumber.getNumber2());

    }

    private static class BiNumber {
        private int x;
        private int y;

        public BiNumber(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int add() {

            return x + y;
        }

        public int multiply() {
            return x * y;
        }

        public int getNumber1() {
            return x;
        }

        public int getNumber2() {
            return y;
        }
    }
}
