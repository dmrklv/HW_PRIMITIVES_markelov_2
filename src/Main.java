
public class Main {
    public static void main(String[] args) {
        int clientBalance = 100; // Основной баланс клиента
        int refillBalance = 3453; // Сумма которой пополняют основной баланс клиента
        float bonus;


        if (refillBalance > 1000) { // Условия для получения бонусов
            bonus = (int) refillBalance / clientBalance; // Формула расчета бонусов
            System.out.println("Received Bonus - " + (bonus));
            System.out.print("Your balance is - " + (clientBalance + refillBalance + bonus));
        } else {
            System.out.println("Received Bonus - " + (bonus = 0));
            System.out.println("Your Balance is - " + (clientBalance + refillBalance));

        }

    }
}