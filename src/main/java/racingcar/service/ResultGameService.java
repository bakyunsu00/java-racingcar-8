package racingcar.service;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.FinishLine;

public class ResultGameService {


    List<Car> carList = new ArrayList<>();
    FinishLine finishLine = new FinishLine();

    public ResultGameService(List<Car> carList) {
        this.carList = carList;
    }

    public void checkMaxDistance() {
        for (Car car : carList) {
            if (car.getMoveCount() > finishLine.getMaxDistance()) {
                finishLine.changeMaxDistance(car.getMoveCount());
            }
        }
    }

    public void checkWinner() {
        for (Car car : carList) {
            if (car.getMoveCount() == finishLine.getMaxDistance()) {
                finishLine.addWinner(car);
            }
        }
    }


    public void printResult() {
        for (Car car : carList) {
            System.out.printf("%s : " + "-".repeat(car.getMoveCount()) + "%n", car.getName());
        }
        System.out.println(); //개행만 추가
    }

    public void printWinner() {
        System.out.println("최종 우승자 : " + String.join(", ", finishLine.getWinnerList()));
    }


}
