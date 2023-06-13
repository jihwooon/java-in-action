package chapter3.summaryStatistics;

@FunctionalInterface
public interface Exporter {
    String export(SummaryStatistics summaryStatistics);
}
