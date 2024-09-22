package Logic;

import data.DataLoading;
import data.User;

import java.util.Random;
import java.util.Scanner;

public class SecondButton {

    boolean itIsEndOfWork = false;
    boolean registrationWork = true;

    String textSelectAction = """
            1.Зайти в учётную запись
            2.Зарегистрироваться""";

    String textRegistrationTryAgain = """
            1.Регистрация
            2.Попробовать снова
            """;

    public SecondButton(){
        while (!itIsEndOfWork){
            System.out.println(textSelectAction);
            Scanner sc = new Scanner(System.in);
            switch (sc.nextLine()){
                case "1":
                    Enter();
                    break;
                case "2":
                    Registration();
                    itIsEndOfWork = true;
                    break;
                default:
                    System.out.println("Нет такого действия");
                    break;
            }
        }
    }

    public void Enter(){
        int numberOfAttemps = 3;
        while (numberOfAttemps >= 0){
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите имя: ");
            String firstName = sc.next();
            System.out.print("Введите фамилию: ");
            String lastName = sc.next();
            if(!EnterChecking(firstName, lastName)){
                numberOfAttemps--;
                System.out.println("Вход не выполнен");
                if(numberOfAttemps == 2){
                    boolean attempsSelected = false;
                    while (!attempsSelected){
                        System.out.print(textRegistrationTryAgain);
                        switch (sc.next()){
                            case "1":
                                Registration();
                                break;
                            case "2":
                                attempsSelected = true;
                                break;
                            default:
                                System.out.println("Нет такого действия");
                                break;
                        }
                    }

                }
            }

        }

        if(numberOfAttemps < 0){
            itIsEndOfWork = true;
            System.out.println("Ошибка входа");
        }



    }

    public boolean EnterChecking(String firstName, String lastName){
        for (int i = 0; i < DataLoading.users.size(); i++){
            if(firstName.equals(DataLoading.users.get(i).firstName)
                    && lastName.equals(DataLoading.users.get(i).lastName)){
                return true;
            }
        }
        return false;
    }

    public boolean isItEnd(){
        if(registrationWork)return itIsEndOfWork;
        else return false;
    }

    public void Registration(){
        while (registrationWork){
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите имя: ");
            String firstName = sc.next();
            System.out.print("Введите фамилию: ");
            String lastName = sc.next();

            if(!EnterChecking(firstName, lastName)){
                while (registrationWork){
                    System.out.print("Введите номер банковского счёта: ");
                    String bankAccountNumber = sc.next();
                    if (bankAccountNumber.length() == 6){
                        for (int i = 0; i < DataLoading.users.size(); i++){
                            if(!bankAccountNumber.equals(DataLoading.users.get(i).bankAccountNumber) && i == DataLoading.users.size()-1){
                                Random random = new Random();
                                int check = random.nextInt(300_000, 5_000_001);
                                DataLoading.users.add(new User(firstName, lastName, bankAccountNumber, check));
                                System.out.println("Регистрация пользователя: " + firstName + " " + lastName + ", с банковским счётом " + bankAccountNumber + " прошла успешна." + "\nБаланс вашего аккаунта составляет: " + check);
                                registrationWork = false;
                                break;
                            }
                            else if(i == DataLoading.users.size()-1) {
                                System.out.println("Данный банковский счёт используется другим пользователем");
                                break;
                            }
                        }
                    }
                    else System.out.println("В банковском счёте должно быть 6 цифр");

                }
            }
            else{
                System.out.println("Данный пользователь уже существует");
                registrationWork = false;
            }


        }
    }
}
