package ui;


import domain.Car;
import domain.Cars;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static Scanner input = new Scanner(System.in);

    public static Cars Start(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        Scanner scanner = new Scanner(System.in);

        String inputNames = scanner.nextLine();

        List<String> splitInputNames = Arrays.asList(inputNames.split(","));

        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < splitInputNames.size(); i++) {
            carList.add(new Car(splitInputNames.get(i)));
        }

        return new Cars(carList);
    }

    public static int Racing() {
        System.out.println("시도할 회수는 몇회인가요?");

        Scanner scanner = new Scanner(System.in);

        int attempt_count = scanner.nextInt();

        return attempt_count;

    }

}
