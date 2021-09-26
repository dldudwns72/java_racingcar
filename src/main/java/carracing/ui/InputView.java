package carracing.ui;

import carracing.Car;
import carracing.Cars;

import java.util.Scanner;

public class InputView {

    private static final String INPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String ATTEMPT_GAME = "시도할 회수는 몇회인가요?";


    public static Cars createCars(){
        System.out.println(INPUT_CAR_NAME);

        Scanner inputCarName = new Scanner(System.in);

        String carName = inputCarName.next();

        Cars cars = new Cars(carName);

        return cars;
    }

    public static int attemptCount(){
        System.out.println(ATTEMPT_GAME);

        Scanner inputAttemptGame = new Scanner(System.in);

        int attemptCount = Integer.parseInt(inputAttemptGame.next());

        return attemptCount;
    }

}
