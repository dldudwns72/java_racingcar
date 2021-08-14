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
    @DisplayName("")
    public void generate(){
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("lee"));
        carList.add(new Car("hye"));

        Cars cars = new Cars(carList);
        String result1 = cars.getCars().get(0).getName();
        String result2 = cars.getCars().get(1).getName();

        assertThat(result1).isEqualTo("lee");
        assertThat(result2).isEqualTo("hye");

    }
}
