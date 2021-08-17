package ui;


import domain.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    public static List<Car> start(){

        List<String> carNames = inputCars();

        List<Car> carList = createCars(carNames);

        return carList;
    }

    // static 메소드로 선언해야 하는 이유?
    private static List<String> inputCars(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        Scanner scanner = new Scanner(System.in);

        String inputNames = scanner.nextLine();

        return Arrays.asList(inputNames.split(","));
    }

    private static List<Car> createCars(List<String> cars){
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < cars.size(); i++) {
            carList.add(new Car(cars.get(i)));
        }

        return carList;
    }

    public static int attempt() {
        System.out.println("시도할 회수는 몇회인가요?");

        Scanner scanner = new Scanner(System.in);

        int attempt_count = scanner.nextInt();

        return attempt_count;

    }

}
