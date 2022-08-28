import java.time.LocalDate;

public class Main {

    public static void specifyYear(int year) {

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }}

    public static void identifyOs(int clientOS,int clientDeviceYear){
        if(clientOS == 0 && clientDeviceYear > 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");}
        else if(clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear>2015){
            System.out.println("Установите версию приложения для Android по ссылке");}
        else if (clientOS == 1 && clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }


    public static void definionDistance(int deliveryDistance){
        int day=1;
        if (deliveryDistance>20){
            day++;

        } if(deliveryDistance>60){
            day++;
        }
        System.out.println("потребуется дней:"+day);
    }

        public static void main (String[]args) {
            int howYear = 2022;
            specifyYear(howYear);
            System.out.println();

            int clientOsNew = 1;
            int currentYear = LocalDate.now().getYear();
            identifyOs(clientOsNew,currentYear);
            System.out.println();

            int distanceToHouse = 100;
            definionDistance(distanceToHouse);


        }
    }

