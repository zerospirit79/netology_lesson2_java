public class Main {

    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли
        int priceTicket = 60;
        int bonusMiles;

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
        bonusMiles = priceTicket / 20;
        System.out.println("Вам начислено - " + bonusMiles + " бонусных миль");

    }
}
