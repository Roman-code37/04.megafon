package ru.itpark.Rates;

public class BasicRate {
    private String name;
    private int subscriptionFee;
    private String internet;
    private String feature;
    private int period;

    public static String Unlimited = "Безлимит";

    public BasicRate(String name, int subscriptionFee, String internet, String feature, int period) {
        this.name = name;
        this.subscriptionFee = subscriptionFee;
        this.internet = internet;
        this.feature = feature;
        this.period = period;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubscriptionFee() {
        return subscriptionFee;
    }

    public void setSubscriptionFee(int subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

}
