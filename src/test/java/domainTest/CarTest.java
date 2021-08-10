package domainTest;

import domain.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    @DisplayName("전진")
    public void 전진(){
        Car car = new Car("lee"){
            @Override
            protected int getRandomNumber() {
                return 6;
            }
        };

        car.move();

        assertThat(car.getMoveCount()).isEqualTo(1);
    }

    @Test
    @DisplayName("정지")
    public void 정지(){
        Car car = new Car("lee"){
            @Override
            protected int getRandomNumber() {
                return 4;
            }
        };

        car.move();

        assertThat(car.getMoveCount()).isEqualTo(0);
    }




}
