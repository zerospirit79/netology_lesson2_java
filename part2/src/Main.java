import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму пополнения баланса: ");
        int amount = 100;
        int transaction = in.nextInt();
        int finalCount;
        int bonus;

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        if (transaction > 1000) {
            bonus = transaction/100;
        } else {
            System.out.println("Вы пополнили на сумму менее 1000 руб");
            bonus = 0;
        }
        finalCount = transaction + amount + bonus;
        System.out.println("Сумма на счету = " +finalCount + " рублей");
    }
}
