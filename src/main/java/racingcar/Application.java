package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import racingcar.domain.Car;
import racingcar.service.RacingGameService;

public class Application {
    public static void main(String[] args) {




        List<Car> carList = new ArrayList<>();
        String[] carName;
        int roundCount;

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        carName =  Console.readLine().split(",");
        System.out.println("시도할 횟수는 몇 회인가요?");
        roundCount = Integer.parseInt(Console.readLine());


        for(String str:carName){
            Car car = new Car(str);
            carList.add(car);
        }

        RacingGameService racingGameService = new RacingGameService(carList,roundCount);




    }
}
