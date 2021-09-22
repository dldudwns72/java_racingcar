package carRacingTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    @DisplayName("자동차 생성")
    public void createCar(){
        Car car = new Car(1,"lee");

        int carPosition = car.getPosition();
        String carName = car.getName();

        assertThat(carPosition).isEqualTo(1);
        assertThat(carName).isEqualTo("lee");
    }

}
