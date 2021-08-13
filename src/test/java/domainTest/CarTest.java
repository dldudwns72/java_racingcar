package domainTest;

import Exceptions.NameValidationException;
import domain.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    @DisplayName("전진")
    public void 전진(){
        Car car = new Car("lee");

        car.move(6);

        assertThat(car.getMoveCount()).isEqualTo(1);
    }

    @Test
    @DisplayName("정지")
    public void 정지(){
        Car car = new Car("lee");

        car.move(2);

        assertThat(car.getMoveCount()).isEqualTo(0);
    }

    @Test
    @DisplayName("두칸 전진")
    public void two전진(){
        Car car = new Car("lee");

        car.move(6);
        car.move(6);

        assertThat(car.getMoveCount()).isEqualTo(2);
    }

    @Test
    @DisplayName("세번 실행 2칸전진 1칸 정지")
    public void two전진one정지(){
        Car car = new Car("lee");

        car.move(6);
        car.move(6);
        car.move(2);

        assertThat(car.getMoveCount()).isEqualTo(2);
    }

    @Test
    @DisplayName("5자 이상 에러")
    public void nameValid(){
        assertThatThrownBy(()->{
            Car car = new Car("leekim");
        }).isInstanceOf(NameValidationException.class);

    }




}
