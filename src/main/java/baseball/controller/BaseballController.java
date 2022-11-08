package baseball.controller;

import baseball.service.BaseballService;
import baseball.view.BaseballView;

public class BaseballController {
    private final BaseballService baseballService = new BaseballService();
    private final BaseballView baseballView = new BaseballView();

    public void createBaseballNumber() {
        baseballService.createBaseballNumber();
    }

    public void startGame() {
        baseballView.startGame();
    }

    public void getUserNumbers() {
        baseballView.getUserNumbers();
    }
}
