package ui;

import domain.Car;
import domain.Winners;

import java.util.List;

public class ResultView {

    public static void printResult(List<Car> cars) {

        Winners winners = new Winners(cars);

        winners.judge();

    }

}
