import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ExchangeHistory history = new ExchangeHistory();
        CurrencyConverter calculate = new CurrencyConverter();

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        System.out.println("\nДобро пожаловать в приложение 'Обмен валюты'!");

        while (true) {

            System.out.println("\n1: Обмен валют");
            System.out.println("2: Просмотреть историю обмена");
            System.out.println("3: Выход");

            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.println("Введите сумму для обмена:");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Введите название исходной валюты (например USD, GBP или EUR):");
                String toCurrency = scanner.nextLine().toUpperCase();
                System.out.println("Введите название целевой валюты (например USD, GBP или EUR):");
                String fromCurrency = scanner.nextLine().toUpperCase();
                if (!(fromCurrency.equalsIgnoreCase("USD")
                        || fromCurrency.equalsIgnoreCase("EUR")
                        || fromCurrency.equalsIgnoreCase("GBP"))
                        || !(toCurrency.equalsIgnoreCase("USD")
                        || toCurrency.equalsIgnoreCase("EUR")
                        || toCurrency.equalsIgnoreCase("GBP"))) {
                    System.out.println("Неправильное название валюты.");
                    continue;
                }
                double result = calculate.convert(amount, CurrencyType.valueOf(toCurrency),
                        CurrencyType.valueOf(fromCurrency));
                ExchangeTransaction transaction = new ExchangeTransaction(localDate,
                        localTime, amount, fromCurrency, toCurrency, result);
                history.addTransaction(transaction);
                System.out.println(transaction);
            } else if (selection == 2) {
                System.out.println("Список трансакций :");
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
