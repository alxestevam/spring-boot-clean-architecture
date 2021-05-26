package br.facens.livrosgamificados.livrosgamificados.adapters.gateways;

import br.facens.livrosgamificados.livrosgamificados.entities.SubscriptionPlan;
import br.facens.livrosgamificados.livrosgamificados.entities.User;

import javax.persistence.*;

@Entity()
@Table(name = "SystemUser")
public class UserDataMapper {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    @Enumerated(EnumType.STRING)
    private SubscriptionPlan subscriptionPlan;
    private Integer coins;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public static UserDataMapper fromEntity(User user) {
        UserDataMapper userDataMapper = new UserDataMapper();

        userDataMapper.setUsername(user.getUsername());
        userDataMapper.setCoins(user.getCoins());
        userDataMapper.setSubscriptionPlan(user.getSubscriptionPlan());

        return userDataMapper;
    }
}
