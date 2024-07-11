//  Интерфейс Calculator - определяет условие для работы класса CurrencyConverter
public interface Calculator {
    double convert(double amount, CurrencyType fromCurrency, CurrencyType toCurrency);
}
