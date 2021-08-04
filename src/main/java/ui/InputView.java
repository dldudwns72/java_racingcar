package ui;

import domain.Car;
import domain.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    public static void main(String[] args) {

        String createCar = inputCar();

        String[] split_createCar = createCar.split(",");


        inputCount();


    }

    private static String inputCar(){
        System.out.println("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)를 기준으로 구분).");

        Scanner createCar = new Scanner(System.in);

        return createCar.nextLine();
    }

    private static int inputCount(){
        System.out.println("시도할 회수는 몇회인가요?");

        Scanner racingCountInput = new Scanner(System.in);

        return racingCountInput.nextInt();
    }

}
