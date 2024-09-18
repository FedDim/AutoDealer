package Logic;

import data.Car;

import java.util.List;
import java.util.Scanner;

public class FirstButton{

    String textSelectAction ="""
            2.Оформить заказ
            3.Принять заказ
            4.Выйти из программы""";

    public FirstButton(List<Car> cars){

        for(Car car: cars){
            System.out.println("Марка: " + car.mark + "\nЦвет " + car.color + "\nКоличество: " + car.quantity + "\nЦена: " + car.price);
        }

    }

    public boolean otherButton(boolean itIsEndOfWork){
        while(!itIsEndOfWork){
            Scanner sc = new Scanner(System.in);
            System.out.println(textSelectAction);
            switch (sc.nextLine()){
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

        return true;
    }

}
