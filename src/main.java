public class main {
    public static void main(String[] args) {
        // Вводные данные
        int balance = 100;
        int replenishment = 1200;
        // логика
        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Баланс:");
        System.out.println((balance + replenishment + bonus) + "рублей");
    }
}