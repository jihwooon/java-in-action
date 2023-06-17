package chapter5;

public class DefaultRule implements Rule {
    private final Condition condition;
    private final Action action;

    public DefaultRule(Condition condition, Action action) {
        this.condition = condition;
        this.action = action;
    }

    public void perform(final Facts facts) {
        if (condition.evaluate(facts)) {
            action.perform(facts);
        }
    }
}
