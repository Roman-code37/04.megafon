package ru.itpark.Rates;

import ru.itpark.Rate;

public class Rest extends BasicRate implements Rate {
    private int callsOrSms;

    public Rest(String name, int subscriptionFee, String internet, String feature, int period, int callsOrSms) {
        super(name, subscriptionFee, internet, feature, period);
        this.callsOrSms = callsOrSms;
    }

    @Override
    public void rate() {

    }
}
