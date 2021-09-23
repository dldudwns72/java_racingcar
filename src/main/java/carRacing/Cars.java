package carRacing;

import carRacing.exception.CarsException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cars {

    private List<Car> carList;

    public Cars(String names){
        splitValid(names);
        List<String> carListToString = Arrays.asList(names.split(","));

        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < carListToString.size(); i++) {
            carList.add(new Car(1,carListToString.get(i)));
        }

        this.carList = carList;
    }

    private void splitValid(String names){
        if(!names.contains(",")){
            throw new CarsException("이름의 구분자는 콤마로 입력 되어야 합니다.");
        }
    }

    public List<Car> getCarList() {
        return Collections.unmodifiableList(carList);
    }


}
