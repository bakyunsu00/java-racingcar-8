package racingcar.service;

import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.RandomPicker;
import racingcar.strategy.MoveStrategy;
import racingcar.strategy.impl.RandomMoveStrategy;

public class RacingGameService {

    MoveStrategy moveStrategy = new RandomMoveStrategy();

    private List<Car> carList;
    private int roundCount;

    public RacingGameService(List<Car> carList, int roundCount) {
        this.carList = carList;
        this.roundCount = roundCount;
    }

    public void playRound(){
        for(Car car: carList){
            car.move(moveStrategy);
        }
    }











}
