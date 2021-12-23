package Model;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> carList = new ArrayList<>();

    public CarService() {
        carList.add(new Car("bmw", 111, 1));
        carList.add(new Car("ford", 222, 2));
        carList.add(new Car("vas", 333, 3));
        carList.add(new Car("mazda", 444, 4));
        carList.add(new Car("opel", 555, 5));
    }


    public List<Car> getCar(Integer i) {
        if (i == null) {
            return carList;
        } else {
            return carList.stream().limit(i).collect(Collectors.toList());
        }
    }
}
