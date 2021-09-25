package carracing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnersTest {

    @Test
    @DisplayName("우승자가 한명일 떄  정보 가져오기")
    public void getWinner(){
        Car leeCar = new Car(3, "lee");
        Car kimCar = new Car(4, "kim");
        Car hyeCar = new Car(5, "hye");

        List<Car> carList = Arrays.asList(leeCar,kimCar,hyeCar);

        Cars cars = new Cars(carList);

        Winners winners = new Winners(cars);

        List<String> winnerList = winners.getWinners();

        assertThat(winnerList).isEqualTo(Arrays.asList("hye"));
    }

    @Test
    @DisplayName("우승자가 두명 이상일 떄  정보 가져오기")
    public void getWinners(){
        Car leeCar = new Car(3, "lee");
        Car kimCar = new Car(5, "kim");
        Car hyeCar = new Car(5, "hye");
        Car parkCar = new Car(5, "park");

        List<Car> carList = Arrays.asList(leeCar,kimCar,hyeCar,parkCar);

        Cars cars = new Cars(carList);

        Winners winners = new Winners(cars);

        List<String> winnerList = winners.getWinners();

        assertThat(winnerList).isEqualTo(Arrays.asList("kim","hye","park"));
    }

}
