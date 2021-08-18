package ui;

import domain.Car;
import domain.Cars;
import domain.Winners;

import java.util.List;

public class ResultView {

    public static void printResult(Cars cars) {

        Winners winners = new Winners(cars);

        String winnerPrint = winners.judge();

        System.out.println(winnerPrint + "가 최종 우승했습니다.");

    }

}
