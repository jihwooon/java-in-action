import java.util.Objects;

public class Elris { //식별자를 가진 객체 (entity or referenced object)

    private Long id;
    private String name;
    private int age;
    private int height;
    private String location;
    private Beverage beverage;

    public Elris(final Long id, final String name, final int age, final int height, final String location, Beverage beverage) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
        this.location = location;
        this.beverage = beverage;
    }

    public int minusHeight(final int height) {
        this.height = height;
        return height;
    }

    //Todo : 엘리스가 음료를 마시면 음료수의 수량이 줄어든다.
    Integer drinkBeverage() {
        int count = beverage.getCount();
        count--;
        return count;
    }

    //Todo : 엘리사가 문을 통과해야 하는 문의 크기가 40센티미터일 때 엘리스 키가 40센티미터 이하로 줄어야 문을 통과 할 수 있다.
    boolean isPassToDoor(Door door) {
        if (height <= door.getHeight()) {
            return true;
        }
        return false;
    }

    //Todo : 문을 통과를 하려면 엘리스의 키가 문 크기이하로 줄어야 한다.
    // 1. 만약 엘리스 키가 문 크기 보다 크면 키를 문 크기로 줄인다.
    // 2. 엘리스 키가 문 크기 이하면 통과 한다.
    boolean isPassToDoorUnderHeight(Door door) {
        int minusHeight = 0;
        if (height > door.getHeight()) {
            minusHeight = minusHeight(door.getHeight());
        }

        if (minusHeight <= door.getHeight()) {
            return true;
        }

        return false;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elris elris = (Elris) o;
        return age == elris.age && height == elris.height && Objects.equals(id, elris.id) && Objects.equals(name, elris.name) && Objects.equals(location, elris.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, height, location);
    }

}

/** 음료수 */
class Beverage { // 식별자가 없는 객체(value object)
    private final String name;
    private final int count;
    private final double amount;

    public Beverage(final String name, final int count, final double amount) {
        this.name = name;
        this.count = count;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}

/** 통과해야 할 문 */
class Door {
    private final String name;
    private final int height;

    public Door(final String name, final int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }
}
