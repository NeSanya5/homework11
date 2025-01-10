import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2025;
        checkingYear(year);
        System.out.println("Задание 2");
        int clientOS = 1;
        int clientDeviceYear = 2020;
        checkingVersionApplication(clientOS, clientDeviceYear);
        System.out.println("Задание 3");
        int deliveryDistance = 90;
        int total = day(deliveryDistance);
        System.out.println(total);


    }

    //Задание 1
    public static void checkingYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //Задани 2
    public static void checkingVersionApplication(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    //Задание 3
    public static int day(int deliveryDistance) {
        int day = 0;
        if (deliveryDistance < 20) {
            day = day + 1;
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            day = day + 2;
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            day = day + 3;
        }else if (deliveryDistance >= 100) {
            System.out.println("Доставка не работает");
        }
        return day;
    }
}