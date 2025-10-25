package racingcar.domain;

public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    void move(){

    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
