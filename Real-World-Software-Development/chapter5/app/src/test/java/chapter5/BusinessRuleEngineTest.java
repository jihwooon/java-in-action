package chapter5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@DisplayName("BusinessRuleEngine 클래스")
class BusinessRuleEngineTest {

    @Nested
    @DisplayName("BusinessRuleEngine의")
    class Context_BusinessRuleEngine {
        private BusinessRuleEngine businessRuleEngine;

        @BeforeEach
        public void setUp() {
            this.businessRuleEngine = new BusinessRuleEngine(new Facts());
        }

        @Test
        @DisplayName("아무것도 생성이 되어 있지 않으면 count 메서드는 횟수가 0이 나온다.")
        void shouldHaveNoRulesInitially() {
            assertThat(businessRuleEngine.count()).isEqualTo(0);
        }

        @Test
        @DisplayName("run 메서드를 검증한다.")
        public void It_OneAction() {
            Facts mockFacts = mock(Facts.class);
            Rule mockRules = mock(Rule.class);
            BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(mockFacts);

            businessRuleEngine.addRule(mockRules);
            businessRuleEngine.run();

            verify(mockRules).perform(mockFacts);
        }
    }

    @Nested
    @DisplayName("addAction 메서드는")
    class Describe_addAction {
        private BusinessRuleEngine businessRuleEngine;

        @BeforeEach
        public void setUp() {
            this.businessRuleEngine = new BusinessRuleEngine(new Facts());
        }

        @Nested
        @DisplayName("특정 거래의 예상치를 계산하는 규칙의")
        class Context_forecastedAmount {

            @Test
            @DisplayName("if 조건에 대한 결과를 count를 센다")
            void it_addFact_if() {
                businessRuleEngine.addRule((facts) -> {
                    var forecastedAmount = 0.0;
                    var dealStage = Stage.valueOf(facts.getFacts("stage"));
                    var amount = Double.parseDouble(facts.getFacts("amount"));
                    if (dealStage == Stage.LEAD) {
                        forecastedAmount = amount * 0.2;
                    } else if (dealStage == Stage.EVALUATING) {
                        forecastedAmount = amount * 0.5;
                    } else if (dealStage == Stage.INTERSTED) {
                        forecastedAmount = amount * 0.8;
                    } else if (dealStage == Stage.INTERSTED) {
                        forecastedAmount = amount;
                    }
                    facts.addFact("forecastedAmount", String.valueOf(forecastedAmount));
                });

                assertThat(businessRuleEngine.count()).isEqualTo(1);
            }

            @Test
            @DisplayName("switch 조건에 대한 결과를 count를 센다.")
            void it_addFact_switch() {
                businessRuleEngine.addRule((facts) -> {
                    var dealStage = Stage.valueOf(facts.getFacts("stage"));
                    var amount = Double.parseDouble(facts.getFacts("amount"));
                    var forecastedAmount = amount * switch (dealStage) {
                        case LEAD -> 0.2;
                        case EVALUATING -> 0.5;
                        case INTERSTED -> 0.8;
                        case CLOSED -> 1;
                    };
                    facts.addFact("forecastedAmount", String.valueOf(forecastedAmount));
                });

                assertThat(businessRuleEngine.count()).isEqualTo(1);
            }
        }
    }
}
