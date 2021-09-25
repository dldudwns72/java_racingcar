package carracing;

import java.util.Random;

public class Racing {

    private Cars cars;

    public Racing(Cars cars){
        this.cars=cars;
    }

    public Cars game(int attemptCount){

        for (int i = 0; i < attemptCount; i++) {
            carMove();
        }

        return this.cars;
    }

    private void carMove(){
        for (int i = 0; i < cars.getCarList().size(); i++) {
            Car car = cars.getCarList().get(i);
            car.move(randomNumber());
        }
    }

    public int randomNumber(){
        Random random = new Random();

        int randomNumber = random.nextInt(10);

        return randomNumber;
    }
}
