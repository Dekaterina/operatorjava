public class Main {
    public static void main(String[] args) {
        int startingAmount = 200; //начальная сумма счета
        int replenishmentamount = 1000; //сумма пополнения
        int bonus;
        if (replenishmentamount > 1000) {
            bonus = replenishmentamount / 100;
            System.out.println("Бонусные рубли:" + bonus);
        } else {
            bonus = 0;
            System.out.println("Бонусные рубли:" + bonus);
        }
        int totalAmount = startingAmount + replenishmentamount + bonus;
        System.out.println("Итоговая сумма:" + totalAmount);
    }
}
