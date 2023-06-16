package chapter5;

@FunctionalInterface
public interface Action {
    void perform(Facts facts);
}
