/**
 * Класс для конвертации валют.
 * Реализует интерфейс Calculator для выполнения конвертации валют.
 */
public class CurrencyConverter implements Calculator {

    /**
     * Конвертирует сумму из одной валюты в другую.
     * @param amount сумма для конвертации
     * @param fromCurrency исходная валюта
     * @param toCurrency целевая валюта
     * @return конвертированная сумма
     */
    @Override
    public double convert(double amount, CurrencyType fromCurrency, CurrencyType toCurrency) {
        double rate = toCurrency.getExchangeRate() / fromCurrency.getExchangeRate();
        return amount * rate;
    }
}
