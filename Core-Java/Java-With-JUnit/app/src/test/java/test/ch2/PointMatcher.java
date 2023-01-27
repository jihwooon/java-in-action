package test.ch2;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class PointMatcher extends TypeSafeMatcher<Point> {
    private static final double TOLERANCE = 0.2;
    private double x;
    private double y;

    public PointMatcher(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText(String.format("a point near (%s, %s)", x, y));
    }

    @Override
    protected boolean matchesSafely(Point point) {
        return Math.abs(x - point.x) <= TOLERANCE &&
                Math.abs(y - point.y) <= TOLERANCE;
    }

    @Factory
    public static <T> Matcher<Point> isNear(double x, double y) {
        return new PointMatcher(x, y);
    }
}
