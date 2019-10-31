package ru.itpark.rate;

public class RestTariff extends BasicRate {
    private int callsOrSms;

    public RestTariff(long id, String name, int subscriptionFee, String internet, String feature, int period, int callsOrSms) {
        super(id, name, subscriptionFee, internet, feature, period);
        this.callsOrSms = callsOrSms;
    }
}
