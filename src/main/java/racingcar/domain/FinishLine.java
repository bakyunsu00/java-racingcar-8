package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class FinishLine {

    private  List<Car> winnerList = new ArrayList<>();
    private int roundCount;

    public FinishLine(int roundCount) {
        this.roundCount = roundCount;
    }

    public void addWinner(Car car){
        if(car.getMoveCount() == roundCount){
            winnerList.add(car);
        }
    }





}
