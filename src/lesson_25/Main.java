package lesson_25;

import lesson_25.rent_a_car.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "files/cars.txt";
        List<Car> cars = readCarsFromFile(fileName);
        CarRepository carRepository = new CarRepoImpl(cars);
        Scanner scanner = new Scanner(System.in);
        all: while (true) {
            printMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter maker, model, yearOfProduction, fuelType, transmission, pricePerDay");
                    String line = scanner.nextLine();
                    Car car = Car.createFromLine(line);
                    carRepository.addCar(car);
                }
                case 2 -> {
                    System.out.println(carRepository.getCars());
                }
                default -> {
                    break all;
                }
            }
        }
        saveStateToFile(carRepository.getCars(), fileName);
    }

    private static void printMenu() {
        System.out.println("Enter a value:");
        System.out.println("1. Add a car:");
        System.out.println("2. List all cars:");
        System.out.println("3. List available cars:");
        System.out.println("4. List rented cars:");
        System.out.println("5. Rent a car:");
        System.out.println("6. Return a car:");
    }

    private static List<Car> readCarsFromFile(String fileName) {
        Path path = Path.of(fileName);
        if (Files.exists(path)) {
            try {
                List<String> lines = Files.readAllLines(path);
                List<Car> cars = new ArrayList<>();
                for (String line : lines) {
                    Car car = Car.createFromLine(line);
                    cars.add(car);
                }
                return cars;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return new ArrayList<>();
    }

    private static void saveStateToFile(List<Car> cars, String fileName) {
        Path path = Path.of(fileName);
        StringBuilder stringBuilder = new StringBuilder();
        for (Car car : cars) {
            stringBuilder.append(car.toFileFormat()).append("\n");
        }
        try {
            Files.writeString(path, stringBuilder.toString(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
