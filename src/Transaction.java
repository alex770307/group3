import java.util.Objects;

public class Transaction {
    private double amount;
    private CurrencyType fromCurrency;
    private CurrencyType toCurrency;

    public Transaction() {
    }

    public Transaction(double amount, CurrencyType fromCurrency, CurrencyType toCurrency) {
        this.amount = amount;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", fromCurrency=" + fromCurrency +
                ", toCurrency=" + toCurrency +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Double.compare(amount, that.amount) == 0 && fromCurrency == that.fromCurrency && toCurrency == that.toCurrency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, fromCurrency, toCurrency);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public CurrencyType getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(CurrencyType fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public CurrencyType getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(CurrencyType toCurrency) {
        this.toCurrency = toCurrency;
    }
}
