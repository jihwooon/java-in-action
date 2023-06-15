package chapter4;

import java.util.Map;

public class Document {
    private final Map<String, String> attributes;

    public Document(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public String getAttributes(final String attrbuteName) {
        return attributes.get(attrbuteName);
    }
}
