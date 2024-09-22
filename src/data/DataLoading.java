package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataLoading {
    public static List<Car> cars = new ArrayList<>();
    public static List<User> users = new ArrayList<>();

    {
        Random random = new Random();

        users.add(new User("Тестовик", "Тестовский", "000000" , random.nextInt(300_000, 5_000_001)));
        users.add(new User("Брат", "МГЕ", "102007", random.nextInt(300_000, 5_000_001)));
        users.add(new User("Замир", "Накиев", "022022", random.nextInt(300_000, 5_000_001)));

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
