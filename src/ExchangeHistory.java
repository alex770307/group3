//   Класс ExchangeHistory - класс сущность, хранит историю всех транзакций обмена валют.

// 	 Конструктор инициализирует пустой список истории
//	 Добавление новой транзакции в историю
// 	 Отображение всех транзакций из истории
import java.util.ArrayList;
import java.util.List;

public class ExchangeHistory {
    public List<ExchangeTransaction> history = new ArrayList<>();

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
