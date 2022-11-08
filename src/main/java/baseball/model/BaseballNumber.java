package baseball.model;

import java.util.List;

public class BaseballNumber {
    private final List<Integer> baseballNumbers;

    public BaseballNumber(List<Integer> baseballNumbers) {
        this.baseballNumbers = baseballNumbers;
    }

    public List<Integer> getBaseballNumbers() {
        return baseballNumbers;
    }
}
