package ui;

import domain.Car;
import domain.Cars;

import java.util.ArrayList;
import java.util.List;

public class ResultView {

    public static void printResult(List<Car> cars) {
        List<String> winner_list = new ArrayList<>();
        String winner = null;
        int max_count = 0;

        for (int i = 0; i < cars.size(); i++) {
            String current_car = cars.get(i).getName();
            int last_count = cars.get(i).getMove_count();

            if (last_count > max_count) {

                winner = current_car;
                max_count = last_count;
            }

            if (max_count == last_count) {
                winner_list.add(winner);
            }

        }

        System.out.println("실행 결과");

        for (int i = 0; i < winner_list.size(); i++) {
            System.out.print(winner_list.get(i) + " ");
        }

        System.out.print("가 최종 우승했습니다.");

    }


}
