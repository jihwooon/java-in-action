package CodingTest;

import java.util.List;

public class test {

    public boolean canReachEnd(List<Integer> maxAdvanceSteps) {
        int furthestReachSoFar = 0;
        int lastIndex = maxAdvanceSteps.size() - 1;

        for (int i = 0; i < furthestReachSoFar && furthestReachSoFar < lastIndex; ++i) {
            furthestReachSoFar = Math.max(furthestReachSoFar, i + maxAdvanceSteps.get(i));
            System.out.println("furthestReachSoFar = " + furthestReachSoFar);
        }

        return furthestReachSoFar >= lastIndex;
    }

}
