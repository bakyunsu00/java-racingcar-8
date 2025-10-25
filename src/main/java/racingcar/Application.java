package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import racingcar.domain.Car;

public class Application {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        String[] carName = Console.readLine().split(",");

        for(String str:carName){
            Car car = new Car(str);
            carList.add(car);
        }



    }
}
