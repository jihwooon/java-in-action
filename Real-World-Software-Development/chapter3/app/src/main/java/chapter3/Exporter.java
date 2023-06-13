package chapter3;

@FunctionalInterface
public interface Exporter {
    String export(SummaryStatistics summaryStatistics);
}
