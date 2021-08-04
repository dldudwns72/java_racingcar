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
            System.out.println(cars.get(i).getName()+ " : " + "-");
        }
    }

}
