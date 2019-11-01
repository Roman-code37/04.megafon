package ru.itpark.tariff;

public class RestTariff extends BasicTariff {
    private int callsOrSms;

    public RestTariff(long id, String name, int subscriptionFee, String internet, String feature, int period, int callsOrSms) {
        super(id, name, subscriptionFee, internet, feature, period);
        this.callsOrSms = callsOrSms;
    }
}
