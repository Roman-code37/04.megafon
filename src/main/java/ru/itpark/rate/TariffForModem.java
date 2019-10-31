package ru.itpark.rate;

public class TariffForModem extends BasicRate {

    public TariffForModem(long id, String name, int subscriptionFee, String internet, String feature, int period) {
        super(id, name, subscriptionFee, internet, feature, period);
    }
}
