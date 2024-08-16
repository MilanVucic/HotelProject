package lesson_25.rent_a_car;

public class Car {
    public static final String SEPARATOR = ",";
    private static int NEXT_ID = 1;

    private int id;
    private String maker;
    private String model;
    private int yearOfProduction;
    private FuelType fuelType;
    private TransmissionType transmission;
    private double pricePerDay;
    private boolean rented;

    public Car(String maker, String model, int yearOfProduction, FuelType fuelType, TransmissionType transmission, double pricePerDay) {
        this(maker, model, yearOfProduction, fuelType, transmission, pricePerDay, false);
    }

    public Car(String maker, String model, int yearOfProduction, FuelType fuelType, TransmissionType transmission, double pricePerDay, boolean rented) {
        this.id = NEXT_ID++;
        this.maker = maker;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.pricePerDay = pricePerDay;
        this.rented = rented;
    }

    public static Car createFromLine(String line) {
        String[] parts = line.split(SEPARATOR);

        return new Car(parts[0], parts[1], Integer.parseInt(parts[2]),
                FuelType.valueOf(parts[3]), TransmissionType.valueOf(parts[4]),
                Double.parseDouble(parts[5]), Boolean.parseBoolean(parts[6]));
    }

    public int getId() {
        return id;
    }

    public boolean isRented() {
        return rented;
    }

    @Override
    public String toString() {
        return id +
                " " + maker +
                " " + model +
                " " + yearOfProduction +
                " " + fuelType +
                " " + transmission +
                " " + pricePerDay;
    }

    public String toFileFormat() {
        return maker +
                SEPARATOR + model +
                SEPARATOR + yearOfProduction +
                SEPARATOR + fuelType +
                SEPARATOR + transmission +
                SEPARATOR + pricePerDay +
                SEPARATOR + rented;
    }
}
