package chapter5;

public class RuleBuilder {
    private Condition condition;

    private RuleBuilder(Condition condition) {
        this.condition = condition;
    }

    public RuleBuilder when(final Condition condition) {
        return new RuleBuilder(condition);
    }

    public Rule then(final Action action) {
        return new DefaultRule(condition, action);
    }
}
