package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService{
    @Override
    public List<Car> getCars(List<Car> list, Integer count) {
        if (count == null) {
            return list;
        } else if (count >= 5) {
            return list;
        } else {
            return list.subList(0, count);
        }
    }
}
