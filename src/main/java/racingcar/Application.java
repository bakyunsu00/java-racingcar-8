package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import racingcar.domain.Car;
import racingcar.service.RacingGameService;
import racingcar.service.ResultGameService;

public class Application {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        String[] carName;
        String rawRoundCount;
        int roundCount;

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        carName = Console.readLine().trim().split(",");
        for (String str : carName) {
            if (str.length() > 5) {
                throw new IllegalArgumentException("이름은 5자 이하여야 합니다");
            }
        }
        System.out.println("시도할 횟수는 몇 회인가요?");
        rawRoundCount = Console.readLine();
        if (rawRoundCount.trim().isBlank()) {
            throw new IllegalArgumentException("입력이 틀립니다");
        }
        try {
            roundCount = Integer.parseInt(rawRoundCount);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력해야 합니다.");
        }

        System.out.println();
        System.out.println("실행 결과");

        for (String str : carName) {
            Car car = new Car(str);
            carList.add(car);
        }

        RacingGameService racingGameService = new RacingGameService(carList);
        ResultGameService resultGameService = new ResultGameService(carList);

        for (int i = 0; i < roundCount; i++) {
            racingGameService.playRound();
            resultGameService.printResult();
        }
        resultGameService.checkMaxDistance();
        resultGameService.checkWinner();
        resultGameService.printWinner();


    }
}
