package test.ch2;

import java.util.HashMap;
import java.util.Map;

public class Profile {
    private Map<String, Answer> answers = new HashMap<>();
    private int score;
    private String name;

    public Profile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(Answer answer) {
        answers.put(answer.getQuestionText(), answer);
    }

    public boolean matches(Criteria criteria) {
        score = 0;

        boolean kill = false;
        boolean anyMatches = false;
        for (Criterion criterion: criteria) {
            Answer answer = answers.get(
                    criterion.getAnswer().getQuestionText());
            boolean match =
                    criterion.getWeight() == Weight.DontCare ||
                            answer.match(criterion.getAnswer());

            kill = isKill(kill, criterion, match);
            extracted(criterion, match);
            anyMatches |= match;
        }

        if (kill)
            return false;
        return anyMatches;
    }

    private void extracted(Criterion criterion, boolean match) {
        if (match) {
            score += criterion.getWeight().getValue();
        }
    }

    private static boolean isKill(boolean kill, Criterion criterion, boolean match) {
        if (!match && criterion.getWeight() == Weight.MustMatch) {
            kill = true;
        }
        return kill;
    }

    public int score() {
        return score;
    }
}
