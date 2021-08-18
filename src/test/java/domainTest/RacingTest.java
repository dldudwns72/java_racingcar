package domainTest;

import domain.Car;
import domain.Cars;
import domain.Racing;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RacingTest {

    private List<Car> carList = new ArrayList<>();

    @BeforeEach
    public void setUp(){

        carList.add(new Car("kwak"));
        carList.add(new Car("lee"));
        carList.add(new Car("yeon"));

    }

    @Test
    @DisplayName("레이싱 시작")
    public void start(){

    }
}
