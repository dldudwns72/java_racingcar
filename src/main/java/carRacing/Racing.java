package carRacing;

import java.util.Random;

public class Racing {

    private Cars cars;

    public Racing(Cars cars){
        this.cars=cars;
    }

    public void game(int attemptCount){
        for (int i = 0; i < attemptCount; i++) {
            carMove();
        }
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
