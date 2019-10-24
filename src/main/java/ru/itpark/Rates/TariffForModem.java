package ru.itpark.Rates;

import ru.itpark.Rate;

public class TariffForModem extends BasicRate implements Rate {

    public TariffForModem(String name, int subscriptionFee, String internet, String feature, int period) {
        super(name, subscriptionFee, internet, feature, period);
    }

    @Override
    public void rate() {

    }
}
