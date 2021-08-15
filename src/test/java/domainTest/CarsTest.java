package domainTest;

import domain.Car;
import domain.Cars;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    private List<Car> carList = new ArrayList<>();

    private Car leeCar = null;
    private Car hyeCar = null;
    private Car kwakCar = null;

    @BeforeEach
    public void setUp() {
        carList.add(new Car("lee"));
        carList.add(new Car("hye"));
        carList.add(new Car("kwak"));

        Cars cars = new Cars(carList);

        leeCar = cars.getCars().get(0);
        hyeCar = cars.getCars().get(1);
        kwakCar = cars.getCars().get(2);
    }

    @Test
    @DisplayName("Car List 생성 후 이름 정상 출력")
    public void generate() {

        assertThat(leeCar.getName()).isEqualTo("lee");
        assertThat(hyeCar.getName()).isEqualTo("hye");
        assertThat(kwakCar.getName()).isEqualTo("kwak");

    }

    @Test
    @DisplayName("Cars 세번 움직임, 두대는 2칸 전진 한대는 3칸전진")
    public void CarsThirdMove() {

        leeCar.move(8);
        leeCar.move(8);
        leeCar.move(2);

        hyeCar.move(8);
        hyeCar.move(8);
        hyeCar.move(8);

        kwakCar.move(8);
        kwakCar.move(8);
        kwakCar.move(8);

        assertThat(leeCar.getMoveCount()).isEqualTo(2);
        assertThat(hyeCar.getMoveCount()).isEqualTo(3);
        assertThat(kwakCar.getMoveCount()).isEqualTo(3);
    }


}
