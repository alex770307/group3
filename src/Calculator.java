/**
 * Интерфейс для конвертации валют.
 * Определяет метод для конвертации суммы из одной валюты в другую.
 */
public interface Calculator {
    /**
     * Конвертирует сумму из одной валюты в другую.
     * @param amount сумма для конвертации
     * @param fromCurrency исходная валюта
     * @param toCurrency целевая валюта
     */
    double convert(double amount, CurrencyType fromCurrency, CurrencyType toCurrency);
}
