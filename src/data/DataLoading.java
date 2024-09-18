package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataLoading {
    public static List<Car> cars = new ArrayList<>();

    {
        Random random = new Random();

        cars.add(new Car("LADA", Baza.carColors[random.nextInt(0, Baza.carColors.length-1)], random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));
        cars.add(new Car("TOYOTA", Baza.carColors[random.nextInt(0, Baza.carColors.length-1)], random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));
        cars.add(new Car("HYUNDAI", Baza.carColors[random.nextInt(0, Baza.carColors.length-1)],random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));
        cars.add(new Car("NISSAN", Baza.carColors[random.nextInt(0, Baza.carColors.length-1)], random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));
        cars.add(new Car("KIA", Baza.carColors[random.nextInt(0, Baza.carColors.length-1)], random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));
        cars.add(new Car("BMW", Baza.carColors[random.nextInt(0, Baza.carColors.length-1)], random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));
        cars.add(new Car("VOLKSWAGEN", Baza.carColors[random.nextInt(0, Baza.carColors.length-1)], random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));
        cars.add(new Car("HONDA", Baza.carColors[random.nextInt(0, Baza.carColors.length-1)], random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));
        cars.add(new Car("MERCEDES-BENZ", Baza.carColors[random.nextInt(0, Baza.carColors.length-1)], random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));
        cars.add(new Car("FORD", Baza.carColors[random.nextInt(0, Baza.carColors.length-1)], random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));

    }
}
