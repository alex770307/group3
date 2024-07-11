import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class MainRuslana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter calculate = new CurrencyConverter();



        LocalTime localTime = LocalTime.now();
       LocalDate localDate = LocalDate.now();


        System.out.println("Введите сумму обмена: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Введите желаемую валюту: EUR,USD, GBD");
        String toCurrency = scanner.nextLine().toUpperCase();
        System.out.println("Введите исходящую валюту валюту: EUR,USD, GBD");
        String fromCurrency = scanner.nextLine().toUpperCase();

        double result = calculate.convert(amount, CurrencyType.valueOf(toCurrency),
                CurrencyType.valueOf(fromCurrency));
        System.out.println("Вот ваша сумма: " + result);


        ExchangeTransaction transaction = new ExchangeTransaction( localDate,
                localTime, amount, fromCurrency, toCurrency, result);
        ExchangeHistory history = new ExchangeHistory();

        history.addTransaction(transaction);

        System.out.println(transaction);
        history.displayHistory();
        System.out.println(history);

    }
}
