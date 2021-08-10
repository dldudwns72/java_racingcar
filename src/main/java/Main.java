import domain.Car;
import domain.Cars;
import ui.InputView;
import ui.ResultView;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cars cars = InputView.Start();

        int attemptCount = InputView.Racing();

        for (int attemptIndex = 0; attemptIndex < attemptCount; attemptIndex++) {
            cars.printNames(attemptIndex + 1);
        }

        List<Car> resultCar = cars.getCars();

        ResultView.printResult(resultCar);

    }

}
