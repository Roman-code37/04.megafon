package ru.itpark.tariff;

public class BasicTariff {
    private long id;
    private String name;
    private int subscriptionFee;
    private String internet;
    private String feature;
    private int period;

    public static final String Unlimited = "Безлимит";

    public BasicTariff(long id, String name, int subscriptionFee, String internet, String feature, int period) {
        this.id = id;
        this.name = name;
        this.subscriptionFee = subscriptionFee;
        this.internet = internet;
        this.feature = feature;
        this.period = period;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
