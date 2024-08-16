package lesson_25.rent_a_car;

import java.util.ArrayList;
import java.util.List;

public class CarRepoImpl implements CarRepository{
    private List<Car> cars;

    public CarRepoImpl(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public Car findById(int id) {
        for (Car car : cars) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }

    @Override
    public List<Car> getCarsByStatus(boolean rented) {
        List<Car> list = new ArrayList<>();
        for (Car car : cars) {
            if (car.isRented() == rented) {
                list.add(car);
            }
        }
        return list;
    }
}
