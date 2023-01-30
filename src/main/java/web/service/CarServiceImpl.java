package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    public static List<Car> cars = List.of(
                new Car("BMW", 400000, 2012),
                new Car("Kia", 350000, 2014),
                new Car("Lada", 250000, 2014),
                new Car("Renault", 500000, 2018),
                new Car("Mercedes", 900000, 2016));

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null) {
            return cars;
        } else if (count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
