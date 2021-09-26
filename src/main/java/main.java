import carracing.Cars;
import carracing.ui.InputView;
import carracing.ui.ResultView;


public class main {
    public static void main(String[] args){
        Cars cars = InputView.createCars();

        int attemptCount = InputView.attemptCount();

        ResultView.printResult(cars,attemptCount);
    }
}
