package baseball.service;

import baseball.model.BaseballNumber;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

import static baseball.common.constant.GameConstant.*;

public class BaseballService {

    public BaseballNumber createBaseballNumber() {
        List<Integer> uniqueNumbers = Randoms.pickUniqueNumbersInRange(
                GAME_MIN_VALUE,
                GAME_MAX_VALUE,
                GAME_INPUT_LENGTH
        );

        return new BaseballNumber(uniqueNumbers);
    }
}
