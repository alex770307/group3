import java.util.ArrayList;
import java.util.List;

/**
 * Класс для хранения истории всех транзакций обмена валют.
 * Реализует интерфейсы HistoryFirst и HistorySecond.
 */
public class ExchangeHistory implements HistoryFirst, HistorySecond {

    /**
     * Список для хранения истории транзакций.
     */
    public List<ExchangeTransaction> history = new ArrayList<>();

    /**
     * Добавляет новую транзакцию в историю.
     * @param transaction транзакция для добавления
     */
    @Override
    public void addTransaction(ExchangeTransaction transaction) {
        history.add(transaction);
    }

    /**
     * Отображает все транзакции из истории.
     */
    @Override
    public void displayHistory() {
        for (ExchangeTransaction transaction : history) {
            System.out.println(transaction);
        }
    }

    /**
     * Возвращает строковое представление объекта.
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "ExchangeHistory{" +
                "history=" + history +
                '}';
    }
}
