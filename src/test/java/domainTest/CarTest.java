package domainTest;

import domain.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    @DisplayName("전진")
    public void 전진(){
        Car car = new Car("lee");

        car.move(6);
        car.move(6);

        assertThat(car.getMoveCount()).isEqualTo(2);
    }

    @Test
    @DisplayName("정지")
    public void 정지(){
        Car car = new Car("lee");

        car.move(4);

        assertThat(car.getMoveCount()).isEqualTo(0);
    }




}
