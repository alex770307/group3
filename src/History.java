/**
 * Интерфейс для отображения истории транзакций и добавления транзакций в историю.
 */
public interface History {

    /**
     * Отображает все транзакции из истории.
     */
    void displayHistory();

    /**
     * Добавляет новую транзакцию в историю.
     * @param transaction транзакция для добавления
     */
    void addTransaction(ExchangeTransaction transaction);
}
