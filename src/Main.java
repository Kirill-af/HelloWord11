import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        checkInsLeapYear(2020);
        checkInsLeapYear(2024);
        checkInsLeapYear(1994);

        System.out.println("Задание 2");

        defineAppVersion(0,2024);
        defineAppVersion(1,2023);
        defineAppVersion(3,2020);

        System.out.println("Задание 3");

        System.out.println("Кол-во дней доставки: " + calcCardDeliveryDays(40));
        System.out.println("Кол-во дней доставки: " + calcCardDeliveryDays(90));
    }
    private static void checkInsLeapYear(int year){

    if (year >= 1584 && (year % 4 ==0 &&  year % 100 != 0 || year % 400 == 0)){
        System.out.println(year + " високосный год");
    }
    else{
            System.out.println(year + " не високосный год");
    }
    }
    private static void  defineAppVersion (int mobileOS, int mobileYear){

        String mobileOsName;

        switch (mobileOS){
            case 0:
                mobileOsName = "Android";
                break;
            case 1:
                mobileOsName = "IOS";
                break;
            default:
                mobileOsName = "неизвестная OC";

        }
        int currentYear = LocalDate.now().getYear();

        if (mobileYear != currentYear) {
            System.out.println("Для ОС " + mobileOsName + " установить lite-версию");
        }
        else {
            System.out.println("Для ОС " + mobileOsName + " установить обычную-версию");
        }

    }
    private static int calcCardDeliveryDays(int distance){
        int deliveryDays;

        if (distance <= 10){
            deliveryDays = 1;
        }
        else if (distance <= 60){
            deliveryDays = 2;
        }
        else  {
            deliveryDays = 3;
        }
        return deliveryDays;
    }

}