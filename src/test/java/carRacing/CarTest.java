package carRacing;

import carRacing.exception.CarException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    @DisplayName("자동차 생성")
    public void createCar() {
        Car car = new Car(1, "lee");

        int carPosition = car.getPosition();
        String carName = car.getName();

        assertThat(carPosition).isEqualTo(1);
        assertThat(carName).isEqualTo("lee");
    }

    @Test
    @DisplayName("이름이 5자를 넘은 자동차 생성 시 에러")
    public void nameRangeCarException() {
        assertThatThrownBy(() -> {
            Car car = new Car(1, "leeyoungjun");
        }).isInstanceOf(CarException.class);


    }


}
