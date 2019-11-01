package ru.itpark.tariff;

public class TurnOnTariff extends BasicTariff {
    private int sms;

    public TurnOnTariff(long id, String name, int subscriptionFee, String internet, String feature, int period, int sms) {
        super(id, name, subscriptionFee, internet, feature, period);
        this.sms = sms;
    }
}
