package Logic;

import data.Baza;
import data.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

    public List<Car> cars = new ArrayList<>();
    boolean itIsEndOfWork = false;

    private final static String textSelectAction = """
            1.Посмотреть доступные автомобили
            2.Оформить заказ
            3.Принять заказ
            4.Выйти из программы""";

    {
        Random random = new Random();

        cars.add(new Car("LADA", Baza.carColors[random.nextInt(0, Baza.carColors.length)-1], random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));
        cars.add(new Car("TOYOTA", Baza.carColors[random.nextInt(0, Baza.carColors.length)-1], random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));
        cars.add(new Car("HYUNDAI", Baza.carColors[random.nextInt(0, Baza.carColors.length)-1],random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));
        cars.add(new Car("NISSAN", Baza.carColors[random.nextInt(0, Baza.carColors.length)-1], random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));
        cars.add(new Car("KIA", Baza.carColors[random.nextInt(0, Baza.carColors.length)-1], random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));
        cars.add(new Car("BMW", Baza.carColors[random.nextInt(0, Baza.carColors.length)-1], random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));
        cars.add(new Car("VOLKSWAGEN", Baza.carColors[random.nextInt(0, Baza.carColors.length)-1], random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));
        cars.add(new Car("HONDA", Baza.carColors[random.nextInt(0, Baza.carColors.length)-1], random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));
        cars.add(new Car("MERCEDES-BENZ", Baza.carColors[random.nextInt(0, Baza.carColors.length)-1], random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));
        cars.add(new Car("FORD", Baza.carColors[random.nextInt(0, Baza.carColors.length)-1], random.nextInt(0, 51), random.nextInt(500_000, 1_500_001)));

    }

    public App(){
        while (!itIsEndOfWork){
            Scanner sc = new Scanner(System.in);
            System.out.println(textSelectAction);
            switch (sc.nextLine()) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":
                    itIsEndOfWork = true;
                    break;
                default:
                    System.out.println("Нет такого действия");
                    break;
            }

        }
    }

}
