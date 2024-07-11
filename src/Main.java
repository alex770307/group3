import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ExchangeHistory history = new ExchangeHistory();
        CurrencyConverter calculate = new CurrencyConverter();

        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        while (true) {
            // Выводим меню пользователю
            System.out.println("Добро пожаловать в приложение 'Обмен валюты'!");
            System.out.println("1: Обмен валют");
            System.out.println("2: Просмотреть историю обмена");
            System.out.println("3: Выход");

            int selection = scanner.nextInt();      //выбор

            if (selection == 1) {
                System.out.println("Введите сумму для обмена:");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Введите название исходной валюты (например USD, GBP или EUR):");
                String toCurrency = scanner.nextLine().toUpperCase();
                System.out.println("Введите название целевой валюты (например USD, GBP или EUR):");
                String fromCurrency = scanner.nextLine().toUpperCase();

                double result = calculate.convert(amount, CurrencyType.valueOf(toCurrency),
                        CurrencyType.valueOf(fromCurrency));
                ExchangeTransaction transaction = new ExchangeTransaction(localDate,
                        localTime, amount, fromCurrency, toCurrency, result);
                history.addTransaction(transaction);
                System.out.println(transaction);

                if (!fromCurrency.equalsIgnoreCase("USD") || !fromCurrency.equalsIgnoreCase("EUR")
                        || !fromCurrency.equalsIgnoreCase("GBP") || !toCurrency.equalsIgnoreCase("USD")
                        || !toCurrency.equalsIgnoreCase("EUR") || !toCurrency.equalsIgnoreCase("GBP")){
                    System.out.println("Неправильное название валюты.");
                    //return;
                    //break;
                }
            } else if (selection == 2) {
                history.displayHistory();
            } else if (selection == 3) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Неправильный выбор.");
            }
        }
    }
}
