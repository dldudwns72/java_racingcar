package carRacing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    private String inputNames;
    private Car leeCar;
    private Car kimCar;
    private Car hyeCar;

    @BeforeEach
    public void setUp() {
        inputNames = "lee,kim,hye";

        leeCar = new Car(1, "lee");
        kimCar = new Car(1, "kim");
        hyeCar = new Car(1, "hye");
    }

    @Test
    @DisplayName("N개의 자동차를 가지는 Cars 객체 생성")
    public void createCars() {

        Cars cars = new Cars(inputNames);

        assertThat(leeCar.equals(cars.getCarList().get(0)));
        assertThat(kimCar.equals(cars.getCarList().get(1)));
        assertThat(hyeCar.equals(cars.getCarList().get(2)));

    }
}
