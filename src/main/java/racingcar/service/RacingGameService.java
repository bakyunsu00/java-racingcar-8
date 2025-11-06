package racingcar.service;

import java.util.List;
import racingcar.domain.Car;
import racingcar.strategy.MoveStrategy;
import racingcar.strategy.impl.RandomMoveStrategy;

public class RacingGameService {

    MoveStrategy moveStrategy = new RandomMoveStrategy();

    private List<Car> carList;


    public RacingGameService(List<Car> carList) {
        this.carList = carList;

    }

    public void playRound() {
        for (Car car : carList) {
            car.move(moveStrategy);
        }
    }


}
