package Ch1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ch1_13_ex {

    public static void main(String[] args) {
        int size = 49;
        Random r = new Random(System.currentTimeMillis());
        ArrayList<Integer> possibles = new ArrayList<>(size + 1);

        for(int i = 1; i <= size; i++) {
            possibles.add(i);
        }

        ArrayList<Integer> picked = new ArrayList<>(6);
        for(int i = 0; i < 6; i++) {
            int pickIndex= r.nextInt(size - 1);
            picked.add(possibles.remove(pickIndex));
        }

        Collections.sort(picked);
        for (int i : picked) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
