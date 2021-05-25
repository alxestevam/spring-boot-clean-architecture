package br.facens.livrosgamificados.livrosgamificados.entities;

public class User {
    private String username;
    private SubscriptionPlan subscriptionPlan;
    private Integer coins;

    public User (SubscriptionPlan subscriptionPlan, Integer coins) {
        this.subscriptionPlan = subscriptionPlan;
        this.coins = coins;
    }

    public SubscriptionPlan getSubscriptionPlan() {
        return subscriptionPlan;
    }

    public void setSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
        this.subscriptionPlan = subscriptionPlan;
    }

    public Integer getCoins() {
        return coins;
    }

    public void setCoins(Integer coins) {
        this.coins = coins;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
