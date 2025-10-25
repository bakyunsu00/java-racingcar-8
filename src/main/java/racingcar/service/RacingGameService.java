package racingcar.service;

import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.RandomPicker;

public class RacingGameService {

    RandomPicker randomPicker = RandomPicker.getInstance();

    private List<Car> carList;
    private int roundCount;


    public RacingGameService(List<Car> carList, int roundCount) {
        this.carList = carList;
        this.roundCount = roundCount;
    }



    void playRound(){
        for(Car car: carList){
            if(randomPicker.pickRandomNumber() >= 4){
                car.move();
            }
        }
    }











}
