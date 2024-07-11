/**
 * Хранит названия валют и их курсы.
 */

public enum CurrencyType {
    EUR(1),
    USD(1.07),
    GBP(0.89);

    private double exchangeRate;

    /**
     * Конструктор для инициализации обменного курса.
     * @param exchangeRate обменный курс валюты
     */
    CurrencyType(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Возвращает строковое представление объекта.
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "CurrencyType{" +
                "exchangeRate=" + exchangeRate +
                '}';
    }

    /**
     * Получает обменный курс валюты.
     */
    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
