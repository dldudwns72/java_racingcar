package carracing.ui;

import java.util.Scanner;

public class InputView {

    private static final String INPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String ATTEMPT_GAME = "시도할 회수는 몇회인가요?";


    public static void GameStart(){
        System.out.println(INPUT_CAR_NAME);

        Scanner inputCarName = new Scanner(System.in);

        String CarName = inputCarName.next();

        System.out.println(ATTEMPT_GAME);

        Scanner inputAttemptGame = new Scanner(System.in);

        int attemptCount = Integer.parseInt(inputAttemptGame.next());


    }

//    public static Cars createCar(){
//        Cars cars = new Cars(inputCar);
//
//
//        return cars;
//    }
}
