package ru.itpark.tariff;

public class TariffForModem extends BasicTariff {

    public TariffForModem(long id, String name, int subscriptionFee, String internet, String feature, int period) {
        super(id, name, subscriptionFee, internet, feature, period);
    }
}
