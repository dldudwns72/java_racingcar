package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> cars;

    public Cars(List<Car> cars){
        this.cars = cars;
    }

    public void printCar(){
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i); // 메소드 연결은 하나만 한다
            System.out.println(car.getName()+ " : " + "-");
        }
    }

}
