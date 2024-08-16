package lesson_25.rent_a_car;

import java.util.List;

public interface CarRepository {
    List<Car> getCars();
    void addCar(Car car);
    Car findById(int id);
    List<Car> getCarsByStatus(boolean rented);
}
