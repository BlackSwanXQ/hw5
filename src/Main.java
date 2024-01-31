public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("task1");
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приолжения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию для Android по ссылке");
        }
        //task2
        int clientDeviceYear = 2015;
        System.out.println("task2");
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приолжения для iOS по ссылке");
            } else {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию для Android по ссылке");
            } else {
                System.out.println("Установите облегчённую версию для Android по ссылке");
            }
        }
        //task3
        System.out.println("task3");
        int year = 2024;
        int leapYear4 = (year - 1584) % 4;
        int leapYear100 = (year - 1584) % 100;
        int leapYear400 = (year - 1584) % 400;

        if (leapYear4 == 0 && leapYear100 != 0) {
            System.out.println(year + " - високосный год.");
        } else if (leapYear400 == 0) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }

        //task4
        System.out.println("task4");
        int deliveryDistance = 100;
        int time = 1;
        if(deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + time);
        } else if(deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (time + 1));
        }else if(deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней: " + (time + 2));
        }else {
            System.out.println("Свыше 100 км доставки нет.");
        }
        //task5
        System.out.println("task5");
    int monthNumber = 4;
    switch(monthNumber) {
        case 12:
        case 1:
        case 2:
            System.out.println("Зима");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Весна");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Лето");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Осень");
            break;
        default:
            System.out.println("Нет такого месяца.");
    }

    }
}