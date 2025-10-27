package racingcar.service;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.strategy.MoveStrategy;
import racingcar.strategy.impl.RandomMoveStrategy;

class RacingGameServiceTest {

    RandomPicker randomPicker = RandomPicker.getInstance();





    @Test
    void playRound() {

        Car car1 = new Car("park");
        Car car2 = new Car("subin");
        Car car3 = new Car("kim");

        MoveStrategy moveStrategy = new RandomMoveStrategy();
        List<Car> carList = new ArrayList<>();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        for(Car car: carList){
            car.move(moveStrategy);
        }
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}