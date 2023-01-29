package web.model;

import java.util.List;

public class Car {

    private String model;
    private int cost;
    private int year;

    public Car() {}

    public Car(String model, int cost, int year) {
        this.model = model;
        this.cost = cost;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static List<Car> getCars() {
        return List.of(
                new Car("BMW", 400000, 2012),
                new Car("Kia", 350000, 2014),
                new Car("Lada", 250000, 2014),
                new Car("Renault", 500000, 2018),
                new Car("Mercedes", 900000, 2016));
    }

    @Override
    public String toString() {
        return  "model = " + model +
                ", cost = " + cost +
                ", year = " + year;
    }
}
