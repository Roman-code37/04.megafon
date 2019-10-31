package ru.itpark.rate;

public class TureOnTariff extends BasicRate {
    private int sms;

    public TureOnTariff(long id, String name, int subscriptionFee, String internet, String feature, int period, int sms) {
        super(id, name, subscriptionFee, internet, feature, period);
        this.sms = sms;
    }
}
