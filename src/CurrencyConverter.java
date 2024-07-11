public class CurrencyConverter implements Calculator {
    @Override
    public double convert(double amount, CurrencyType fromCurrency, CurrencyType toCurrency) {
        double rate = toCurrency.getExchangeRate() / fromCurrency.getExchangeRate();
        return amount * rate;
    }
}
