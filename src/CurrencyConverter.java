public class CurrencyConverter implements Calculator {
    @Override
    public double convert(double amount, CurrencyType fromCurrency, CurrencyType toCurrency) {
        // Конвертируем валюту, используя обменный курс.
        double rate = toCurrency.getExchangeRate() / fromCurrency.getExchangeRate();
        return amount * rate;
    }
}
//- **public class CurrencyConverter implements CurrencyConverterInput**:
// Класс `CurrencyConverter` реализует интерфейс `CurrencyConverterInput`,
// то есть он должен предоставить реализацию всех методов, определенных в интерфейсе.
//
//- **@Override**: Эта аннотация указывает, что метод `convert` переопределяется в классе `CurrencyConverter`.
//
//- **Метод `convert`**: Метод принимает сумму денег и коды валют, рассчитывает обменный курс и возвращает сумму после конвертации.
//
//### Зачем это нужно?
//
//1. **Гибкость и расширяемость**: Использование интерфейсов позволяет легко заменять или расширять реализацию класса.
// Например, если вам потребуется другая логика конвертации,
// вы можете создать новый класс, реализующий этот интерфейс,
// и использовать его без изменений в основном коде программы.
//
//2. **Независимость от реализации**: Код, который использует интерфейс,
// не зависит от конкретной реализации, что упрощает тестирование,
// поддержку и модульное программирование