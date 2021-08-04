package ui;

import domain.Car;
import domain.Cars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    public static void main(String[] args) {

        String createCar = inputCar();

        List<String> split_car_name = Arrays.asList(createCar.split(","));

        List<Car> createCars = new ArrayList<>();

        for (int i = 0; i < split_car_name.size(); i++) {
            createCars.add(new Car(split_car_name.get(i),i));
        }

        Cars cars = new Cars(createCars);  // 일급 컬렉션?!

        cars.printCar();

    }

    private static String inputCar(){
        System.out.println("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)를 기준으로 구분).");

        Scanner input_cars = new Scanner(System.in);

        return input_cars.nextLine();
    }

    private static int inputCount(){
        System.out.println("시도할 회수는 몇회인가요?");

        Scanner racingCountInput = new Scanner(System.in);

        return racingCountInput.nextInt();
    }

}
