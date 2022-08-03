package basic;

public class WhileNumberPlayer {

    private int number;

    public WhileNumberPlayer(int number) {
        this.number = number;
    }

    public void printSquaresUptoLimit() {
        int i = 1;
        while (i * i < number) {
            System.out.println("i = " + i * i);
            i++;
        }
    }

    public void printCubesUptoLimit() {
        int i = 1;
        while (i * i * i < number) {
            System.out.println("i = " + i * i * i);
            i++;
        }
    }

    public static void main(String[] args) {
        WhileNumberPlayer player = new WhileNumberPlayer(30);

        player.printSquaresUptoLimit();
        player.printCubesUptoLimit();

    }
}
