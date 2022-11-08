package baseball.view;

import camp.nextstep.edu.missionutils.Console;

import static baseball.common.constant.MessageConstants.INPUT_REQUIRE_MESSAGE;
import static baseball.common.constant.MessageConstants.START_MESSAGE;

public class BaseballView {
    public static void startGame() {
        System.out.println(START_MESSAGE);
    }

    public void getUserNumbers() {
        System.out.print(INPUT_REQUIRE_MESSAGE);
        Console.readLine();
    }
}
