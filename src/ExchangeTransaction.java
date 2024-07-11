import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

/**
 * Класс сущность, который содержит необходимые поля и информацию о транзакции обмена валют.
 */
public class ExchangeTransaction {
    private LocalDate date;
    private LocalTime time;
    private double amount;
    private String fromCurrency;
    private String toCurrency;
    private double result;

    /**
     * Конструктор по умолчанию.
     */
    public ExchangeTransaction() {
    }

    /**
     * Конструктор для инициализации всех полей.
     *
     * @param date         дата транзакции
     * @param time         время транзакции
     * @param amount       сумма для обмена
     * @param fromCurrency исходная валюта
     * @param toCurrency   целевая валюта
     * @param result       результат обмена
     */
    public ExchangeTransaction(LocalDate date, LocalTime time, double amount,
                               String fromCurrency, String toCurrency, double result) {
        this.date = date;
        this.time = time;
        this.amount = amount;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.result = result;
    }
    /**
     * Возвращает строковое представление объекта.
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "ExchangeTransaction{" +
                "date=" + date +
                ", time=" + time +
                ", amount=" + amount +
                ", fromCurrency='" + fromCurrency + '\'' +
                ", toCurrency='" + toCurrency + '\'' +
                ", result=" + result +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExchangeTransaction that = (ExchangeTransaction) o;
        return Double.compare(amount, that.amount) == 0
                && Double.compare(result, that.result) == 0
                && Objects.equals(date, that.date)
                && Objects.equals(time, that.time)
                && Objects.equals(fromCurrency, that.fromCurrency)
                && Objects.equals(toCurrency, that.toCurrency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, time, amount, fromCurrency, toCurrency, result);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
