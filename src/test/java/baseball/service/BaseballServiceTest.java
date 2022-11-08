package baseball.service;

import baseball.model.BaseballNumber;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static baseball.common.constant.GameConstant.GAME_INPUT_LENGTH;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BaseballServiceTest {

    private final BaseballService baseballService = new BaseballService();

    @Test
    public void 랜덤숫자_중복_테스트() {
        // when
        BaseballNumber baseballNumber = baseballService.createBaseballNumber();

        List<Integer> uniqueNumbers = baseballNumber.getBaseballNumbers();
        HashSet<Integer> uniNumbersToSet = new HashSet<>(uniqueNumbers);

        // then
        assertThat(uniNumbersToSet.size()).isEqualTo(GAME_INPUT_LENGTH);
    }

}