public class Main {
    public static void main(String[] args) {
        int amount = 100;
        // начальная сумма счета
        int pay = 2345;
        // сумма пополнения
        int bonus;
        if (pay > 1000) {
            bonus = pay / 100;
            // бонус за каждые 100 р с суммы свыше 1000 р
        } else {
            bonus = 0;
        }
        int invoiceAmount = amount + pay + bonus;
        System.out.println("На вашем счету: " + invoiceAmount);
    }
}