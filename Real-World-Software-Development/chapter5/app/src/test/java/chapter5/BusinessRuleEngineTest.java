package chapter5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@DisplayName("BusinessRuleEngine 클래스")
class BusinessRuleEngineTest {

    private BusinessRuleEngine businessRuleEngine;

    @BeforeEach
    public void setUp() {
        this.businessRuleEngine = new BusinessRuleEngine();
    }

    @Test
    @DisplayName("businessRuleEngine에 아무것도 생성이 되어 있지 않으면 count 횟수가 0이 나온다.")
    void shouldHaveNoRulesInitially() {
        assertThat(businessRuleEngine.count()).isEqualTo(0);
    }

    @Test
    @DisplayName("액션이 두 개 이상 추가되면 addAction의 갯수만큼 count를 센다.")
    void shouldAddTwoActions() {
        businessRuleEngine.addAction(() -> {});
        businessRuleEngine.addAction(() -> {});

        assertThat(businessRuleEngine.count()).isEqualTo(2);
    }

    @Test
    @DisplayName("businessRuleEngine의 run 메서드를 검증한다.")
    public void shouldExecuteOneAction() {
        Action mockAction = mock(Action.class);

        businessRuleEngine.addAction(mockAction);
        businessRuleEngine.run();

        verify(mockAction).perform();
    }
}
