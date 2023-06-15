package chapter4;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toMap;

class Query implements Predicate<Document> {
    private final Map<String, String> clauses;

    static Query parser(final String query) {
        return new Query(Arrays.stream(query.split(","))
                .map(str -> str.split(":"))
                .collect(toMap(x -> x[0], x -> x[1])));
    }

    Query(Map<String, String> clauses) {
        this.clauses = clauses;
    }

    @Override
    public boolean test(Document document) {
        return clauses.entrySet()
                .stream()
                .allMatch(entry -> {
                    final String documentValue = document.getAttributes(entry.getKey());
                    final String queryValue = entry.getValue();
                    return documentValue != null && documentValue.contains(queryValue);
                });
    }

}
