package carRacing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {
    private String inputNames;
    private Cars cars;
    private int attemptCount = 5;

    @BeforeEach
    public void setUp() {
        inputNames = "lee,kim,hye";
        cars = new Cars(inputNames);

    }

    @Test
    @DisplayName("racing 게임 난수 발생 5 미만시 전진 안함")
    public void racingStop(){
        Racing racing  = new Racing(cars){
            @Override
            public int randomNumber(){
                return 4;
            }
        };

        int leeCarPosition = cars.getCarList().get(0).getPosition();
        int kimCarPosition = cars.getCarList().get(1).getPosition();
        int hyeCarPosition = cars.getCarList().get(2).getPosition();

        racing.game(attemptCount);

        assertThat(leeCarPosition).isEqualTo(1);
        assertThat(kimCarPosition).isEqualTo(1);
        assertThat(hyeCarPosition).isEqualTo(1);
    }

    @Test
    @DisplayName("racing 게임 난수 발생 5 이상 시 전진")
    public void racingGo(){
        Racing racing  = new Racing(cars){
            @Override
            public int randomNumber(){
                return 6;
            }
        };

        racing.game(attemptCount);

        int leeCarPosition = cars.getCarList().get(0).getPosition();
        int kimCarPosition = cars.getCarList().get(1).getPosition();
        int hyeCarPosition = cars.getCarList().get(2).getPosition();

        assertThat(leeCarPosition).isEqualTo(6);
        assertThat(kimCarPosition).isEqualTo(6);
        assertThat(hyeCarPosition).isEqualTo(6);
    }


}
