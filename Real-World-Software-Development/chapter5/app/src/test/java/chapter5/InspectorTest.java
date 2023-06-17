package chapter5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Inspector 클래스")
class InspectorTest {

    @Nested
    @DisplayName("inspect 메서드는")
    class Describe_inspect {
        @Nested
        @DisplayName("facts에 값이 있다면")
        public class Context_with_setFact {
            private Facts facts;
            private JobTitleCondition conditionAction;
            private Inspector inspector;

            @BeforeEach
            public void setUp() {
                this.facts = new Facts();
                this.conditionAction = new JobTitleCondition();
                this.inspector = new Inspector(conditionAction);
            }

            @Test
            @DisplayName("report 리스트의 크기를 반환한다.")
            public void it_return_reportList_size() {
                facts.setFact("jobTitle", "CEO");
                List<Report> reportList = inspector.inspect(facts);

                assertThat(reportList).hasSize(1);
            }

            @Test
            @DisplayName("report 리스트가 True로 반환한다.")
            public void it_inspectOneCondition_EvaluatesTrue() {
                facts.setFact("jobTitle", "CEO");
                List<Report> reportList = inspector.inspect(facts);

                assertTrue(reportList.get(0).isPositive());
            }
        }
    }

    class JobTitleCondition implements ConditionalAction {

        @Override
        public boolean evaluate(Facts facts) {
            return "CEO".equals(facts.getFacts("jobTitle"));
        }

        @Override
        public void perform(Facts facts) {
            throw new UnsupportedOperationException();
        }
    }
}
