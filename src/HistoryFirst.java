/**
 * Интерфейс для добавления транзакций в историю.
 */
public interface HistoryFirst {

    /**
     * Добавляет новую транзакцию в историю.
     * @param transaction транзакция для добавления
     */
        void addTransaction(ExchangeTransaction transaction);
    }

