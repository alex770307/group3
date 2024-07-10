import java.util.ArrayList;
import java.util.List;

public class ExchangeHistory {
    public List<ExchangeTransaction> history;

    public ExchangeHistory() {
        history = new ArrayList<>();
    }


    public void addTransaction(ExchangeTransaction transaction) {
        history.add(transaction);
    }


    public void displayHistory() {
        for (ExchangeTransaction transaction : history) {
            System.out.println(transaction);
        }
    }

    @Override
    public String toString() {
        return "ExchangeHistory{" +
                "history=" + history +
                '}';
    }
}
