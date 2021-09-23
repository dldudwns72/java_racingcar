package carRacing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cars {

    private List<Car> carList;

    public Cars(String names){
        List<String> carListToString = Arrays.asList(names.split(","));

        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < carListToString.size(); i++) {
            carList.add(new Car(1,carListToString.get(i)));
        }

        this.carList = carList;
    }

    public List<Car> getCarList() {
        return Collections.unmodifiableList(carList);
    }
}
