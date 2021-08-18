package ui;

import domain.Car;
import domain.Cars;
import domain.Winners;

import java.util.List;

public class ResultView {

    public static void printResult(Cars cars) {

        Winners winners = new Winners(cars);

        winners.judge();

    }

}
