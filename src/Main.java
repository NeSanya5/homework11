import java.time.LocalDate;

public class Main {

    public static void checkingYars(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkingVersionApplication(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear >= currentYear) {
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

    public static void estimatedDeliveryTime(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней:1");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней:2");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней:3");
        } else if (deliveryDistance >= 100) {
            System.out.println("Доставка не работает");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2025;
        checkingYars(year);
        System.out.println("Задание 2");
        int clientOS = 1;
        int clientDeviceYear = 2020;
        checkingVersionApplication(clientOS, clientDeviceYear);
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        estimatedDeliveryTime(deliveryDistance);
    }
}