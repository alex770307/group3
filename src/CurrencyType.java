//    Класс CurrencyType - класс сущность, храненит названия валют и их курсы.

// 	  Конструктор для инициализации обменного курса
//	  Получение обменного курса
//	  Установка обменного курса

public enum CurrencyType {
    EUR(1),
    USD(1.07),
    GBP(0.89);

    private double exchangeRate;

    CurrencyType(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    @Override
    public String toString() {
        return "CurrencyType{" +
                "exchangeRate=" + exchangeRate +
                '}';
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
