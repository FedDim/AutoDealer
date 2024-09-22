package Logic;

import data.DataLoading;

import java.util.Scanner;

public class App {

    DataLoading dataLoading = new DataLoading();

    boolean itIsEndOfWork = false;

    String textSelectAction = """
            1.Посмотреть доступные автомобили
            2.Оформить заказ
            3.Принять заказ
            4.Выйти из программы""";

    public App(){
        while (!itIsEndOfWork){
            Scanner sc = new Scanner(System.in);
            System.out.println(textSelectAction);
            switch (sc.nextLine()) {
                case "1":
                    FirstButton firstButton = new FirstButton(DataLoading.cars);
                    itIsEndOfWork = firstButton.otherButton(itIsEndOfWork);
                    break;
                case "2":
                    SecondButton secondButton = new SecondButton();
                    itIsEndOfWork = secondButton.isItEnd();
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

    public void setItIsEndOfWork(boolean itIsEndOfWork) {
        this.itIsEndOfWork = itIsEndOfWork;
    }
}
