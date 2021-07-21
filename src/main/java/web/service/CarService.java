package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private static List<Car> carList = new ArrayList<>();
    static {
        carList.add(new Car("Mersedes", "1", 2001));
        carList.add(new Car("Lada", "Калина", 2002));
        carList.add(new Car("Reno", "3", 2003));
        carList.add(new Car("Mazda", "4", 2004));
        carList.add(new Car("Pego", "5", 2005));
    }

    public List<Car> getCarList(Integer count) {
        if (count == null || count < 1 || count > 4) {
            return carList;
        }
        return carList.subList(0, count);
    }
}
