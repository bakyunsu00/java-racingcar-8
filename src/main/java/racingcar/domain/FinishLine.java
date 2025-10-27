package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class FinishLine {

    private final int START_DISTANCE = 0;
    private List<String> winnerList = new ArrayList<>();
    private int maxDistance = START_DISTANCE;

    public void addWinner(Car car) {
        if (car.getMoveCount() == maxDistance) {
            winnerList.add(car.getName());
        }
    }

    public List<String> getWinnerList() {
        return winnerList;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void changeMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
