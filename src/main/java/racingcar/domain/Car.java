package racingcar.domain;

import racingcar.strategy.MoveStrategy;

public class Car {
    private String name;
    private int moveCount;

    public Car(String name) {
        this.name = name;
    }

    public void move(MoveStrategy strategy){
        if (strategy.canMove())
        {
            this.moveCount++;
        }
    }


    public String getName() {
        return name;
    }

    public int getMoveCount() {
        return moveCount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", moveCount=" + moveCount +
                '}';
    }


}
