package racingcar.strategy.impl;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.strategy.MoveStrategy;

public class RandomMoveStrategy implements MoveStrategy {

    @Override
    public boolean canMove() {
        if (Randoms.pickNumberInRange(0, 9) >= 4) {
            return true;
        } else {
            return false;
        }

    }
}
