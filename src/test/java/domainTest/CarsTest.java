package domainTest;

import domain.Car;
import domain.Cars;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    @DisplayName("Car List 생성 후 이름 정상 출력")
    public void generate(){
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("lee"));
        carList.add(new Car("hye"));

        Cars cars = new Cars(carList);

        Car result0 = cars.getCars().get(0);
        Car result1 = cars.getCars().get(1);


        assertThat(result0.getName()).isEqualTo("lee");
        assertThat(result1.getName()).isEqualTo("hye");
    }

    @Test
    @DisplayName("Cars 세번 움직임, 두대는 2칸 전진 한대는 3칸전진")
    public void CarsThirdMove(){
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("lee"));
        carList.add(new Car("hye"));
        carList.add(new Car("kwak"));

        Cars cars = new Cars(carList);

        Car leeCar = cars.getCars().get(0);
        leeCar.move(8);
        leeCar.move(8);
        leeCar.move(2);

        Car hyeCar = cars.getCars().get(1);
        hyeCar.move(8);
        hyeCar.move(8);
        hyeCar.move(8);

        Car kwakCar = cars.getCars().get(2);
        kwakCar.move(8);
        kwakCar.move(8);
        kwakCar.move(8);

        assertThat(leeCar.getMoveCount()).isEqualTo(2);
        assertThat(hyeCar.getMoveCount()).isEqualTo(3);
        assertThat(kwakCar.getMoveCount()).isEqualTo(3);
    }





}
