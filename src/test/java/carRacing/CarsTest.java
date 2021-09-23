package carRacing;

import carRacing.exception.CarsException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.smartcardio.CardException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    @Test
    @DisplayName("구분자를 쉼표로 하지 않았을 떄 에러 발생")
    public void splitErrorCars(){
        assertThatThrownBy(()->{
            inputNames = "lee:kim:hye";
            Cars cars = new Cars(inputNames);
        }).isInstanceOf(CarsException.class);
    }

    @Test
    @DisplayName("자동차가 1대 일 경우 에러 발생")
    public void minCarsCount(){
        assertThatThrownBy(()->{
            inputNames = "lee";
            Cars cars = new Cars(inputNames);
        }).isInstanceOf(CarsException.class);
    }



}
