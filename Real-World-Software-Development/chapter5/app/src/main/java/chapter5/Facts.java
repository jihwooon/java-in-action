package chapter5;

import java.util.HashMap;
import java.util.Map;

public class Facts {
    private final Map<String, String> facts = new HashMap<>();

    public String getFacts(final String name) {
        return this.facts.get(name);
    }

    public void addFact(final String name, final String value) {
        this.facts.put(name, value);
    }

    public String setFact(String jobTitle, String ceo) {
        return facts.put(jobTitle, ceo);
    }
}
