import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ElrisTest {
    private Beverage beverage = new Beverage("음료",10, 17);

    @Test
    void result() {
        Elris elris = new Elris(1L, "엘리스", 10, 165, "토끼굴", beverage);

        assertThat(elris).isEqualTo(new Elris(1L, "엘리스", 10, 165, "토끼굴", beverage));
    }

    @Test
    void drankMinus() {
        Elris elris = new Elris(1L, "엘리스", 10, 165, "토끼굴", beverage);

        Integer drinkBeverage = elris.drinkBeverage();
        assertThat(drinkBeverage).isEqualTo(9);
    }

    @Test
    void elris_tall_up_door_tall_false() {
        Door door = new Door("문", 40);
        Elris elris = new Elris(1L, "엘리스", 10, 165, "토끼굴", beverage);

        boolean pass = elris.isPassToDoor(door);
        assertThat(pass).isFalse();
    }

    @Test
    void elris_tall_under_door_tall_pass() {
        Door door = new Door("문", 40);
        Elris elris = new Elris(1L, "엘리스", 10, 165, "토끼굴", beverage);

        boolean pass = elris.isPassToDoor(door);
        assertThat(pass).isFalse();
    }

    @Test
    void elris_change_tall() {
        Door door = new Door("문", 173);
        Elris elris = new Elris(1L, "엘리스", 10, 165, "토끼굴", beverage);

        boolean passToDoorUnderHeight = elris.isPassToDoorUnderHeight(door);
        assertThat(passToDoorUnderHeight).isTrue();
    }
}
