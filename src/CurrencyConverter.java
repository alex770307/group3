//   В классе CurrencyConverter должен быть реализован интерфейс Calculator для того чтобы выполнять конвертацию.

//	 Конвертируем валюту, используя обменный курс.
//	 Рассчитываем обменный курс и умножаем на сумму
public class CurrencyConverter implements Calculator {
    @Override
    public double convert(double amount, CurrencyType fromCurrency, CurrencyType toCurrency) {
        double rate = toCurrency.getExchangeRate() / fromCurrency.getExchangeRate();
        return amount * rate;
    }
}
