package racingcar.service;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.FinishLine;

public class ResultGameService {


    List<Car> carList = new ArrayList<>();
    int roundCount;
    FinishLine finishLine = new FinishLine(roundCount);

    public ResultGameService(List<Car> carList, int roundCount) {
        this.carList = carList;
        this.roundCount = roundCount;
    }

    public void validate(){
        for(Car car: carList){
            finishLine.addWinner(car);
        }
        //
    }


     public void printResult(){
        for(Car car: carList){
        System.out.printf("%s : "+"-".repeat(car.getMoveCount())+"%n",car.getName());}
        System.out.println(); //개행만 추가
     }






}
