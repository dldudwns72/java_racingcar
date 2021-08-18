package domainTest;

import domain.Car;
import domain.Cars;
import domain.Winners;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnersTest {

    private Cars cars;

    @BeforeEach
    void setUp(){

        Car leeCar = new Car("lee");

        leeCar.move(5);
        leeCar.move(5);

        Car kimCar = new Car("kim");
        leeCar.move(2);
        leeCar.move(5);

        Car minCar = new Car("min");
        leeCar.move(2);
        leeCar.move(2);


        List<Car> carList = new ArrayList<>();
        carList.add(leeCar);
        carList.add(kimCar);
        carList.add(minCar);

        cars = new Cars(carList);
    }

    @Test
    @DisplayName("우승자 판별")
    public void judge(){

        Winners winners = new Winners(cars);
        String winnerPrint = winners.judge();
        assertThat(winnerPrint).isEqualTo("lee");
    }
}
