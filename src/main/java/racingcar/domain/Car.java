package racingcar.domain;

public class Car {
    private String name;
    private int moveCount;

    public Car(String name) {
        this.name = name;
    }

    public void move(){
        this.moveCount++;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", moveCount=" + moveCount +
                '}';
    }
}
