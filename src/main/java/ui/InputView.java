package ui;

import domain.Car;
import domain.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    public static void main(String[] args) {

        System.out.println("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)를 기준으로 구분.");

        Scanner scanner = new Scanner(System.in);

        Car car = new Car(scanner.next());



    }
}
