import domain.Car;
import domain.Cars;
import ui.InputView;
import ui.ResultView;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cars cars = InputView.Start(); // List<Car> Car객체를 담고 있는 Cars 객체 생성

        int attemptCount = InputView.Racing(); // 게임 시도 횟수

        // 시도한 횟수만큼 게임을 돈다.
        for (int attemptIndex = 0; attemptIndex < attemptCount; attemptIndex++) {
            cars.printNames(attemptIndex + 1);
        }

        List<Car> resultCar = cars.getCars();

        ResultView.printResult(resultCar);

    }

}
