package ui;

import domain.Car;
import domain.Winner;

import java.util.ArrayList;
import java.util.List;

public class ResultView {

    public static void printResult(List<Car> cars) {

        Winner winner = new Winner(cars);

        winner.judge();

    }



}
