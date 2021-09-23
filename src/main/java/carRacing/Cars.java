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

        minCarValid(carListToString);

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

    private void minCarValid(List<String> carListToString){
        if(carListToString.size() < 2){
            throw new CarsException("자동차는 최소 2대 이상이여야 합니다.");
        }
    }

    public List<Car> getCarList() {
        return Collections.unmodifiableList(carList);
    }


}
