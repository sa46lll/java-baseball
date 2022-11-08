package baseball.controller;

import baseball.service.BaseballService;

public class BaseballController {
    private final BaseballService baseballService = new BaseballService();

    public void createBaseballNumber() {
        baseballService.createBaseballNumber();
    }
}
