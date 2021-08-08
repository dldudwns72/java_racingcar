import domain.Cars;
import ui.InputView;
import ui.ResultView;

public class Main {

    public static void main(String[] args){

        Cars cars = InputView.Start(); // List<Car> Car객체를 담고 있는 Cars 객체 생성

        int attempt_count = InputView.Racing(); // 게임 시도 횟수

        // 시도한 횟수만큼 게임을 돈다.
        for (int attempt_index = 0; attempt_index < attempt_count; attempt_index++) {
            cars.printNames(attempt_index+1);
        }

        ResultView.printResult();

    }

}
