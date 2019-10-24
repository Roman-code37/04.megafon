package ru.itpark.Rates;

import ru.itpark.Rate;

public class TureOn extends BasicRate implements Rate {
    private int sms;

    public TureOn(String name, int subscriptionFee, String internet, String feature, int period, int sms) {
        super(name, subscriptionFee, internet, feature, period);
        this.sms = sms;
    }

    @Override
    public void rate() {
    }
}
