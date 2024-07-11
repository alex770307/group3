//   Класс Main - класс песочница - должен содержать логику работы с пользователем,
//   содержать логику выполнения обмена и логику записи в иснорию.
//	 Выводим меню пользователю
//	 Выполняем действия в зависимости от выбора пользователя
//	 Проверяем, что названия валют правильные
//	 Выполняем конвертацию и выводим результат
//	 Фиксируем дату и добавляем транзакцию в историю

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

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

                Optional<CurrencyType> optional = Arrays.stream(CurrencyType.values())
                        .filter(type -> type.name().equals(toCurrency))
                        .findFirst();
                Optional<CurrencyType> optionalSecond = Arrays.stream(CurrencyType.values())
                        .filter(type -> type.name().equals(fromCurrency))
                        .findFirst();
                if (optional.isPresent() && optionalSecond.isPresent()) {
                    double result = calculate.convert(amount, CurrencyType.valueOf(toCurrency),
                            CurrencyType.valueOf(fromCurrency));
                    ExchangeTransaction transaction = new ExchangeTransaction(localDate,
                            localTime, amount, fromCurrency, toCurrency, result);
                    history.addTransaction(transaction);
                    System.out.println(transaction);
                } else {
                    System.out.println("Неправильное название валюты.");
                }
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
