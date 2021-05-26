package br.facens.livrosgamificados.livrosgamificados.usecases;

import br.facens.livrosgamificados.livrosgamificados.entities.User;

public class SignUpUser implements SignUpUserInputBoundary {
    private final InsertUserGateway insertUserGateway;

    public SignUpUser(InsertUserGateway insertUserGateway) {
        this.insertUserGateway = insertUserGateway;
    }

    @Override
    public SignUpUserResponseData SignUp(SignUpUserRequestData userDto) {
        User user = new User(userDto.username, userDto.subscriptionPlan, 0);

        this.insertUserGateway.insert(user);

        return new SignUpUserResponseData(
                user.getUsername(),
                user.getSubscriptionPlan(),
                user.getCoins()
        );
    }
}
