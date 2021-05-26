package br.facens.livrosgamificados.livrosgamificados.adapters.gateways;

import br.facens.livrosgamificados.livrosgamificados.entities.User;
import br.facens.livrosgamificados.livrosgamificados.usecases.InsertUserGateway;

public class JpaUser implements InsertUserGateway {
    private final JpaUserRepository repository;

    public JpaUser(JpaUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void insert(User user) {
        this.repository.save(UserDataMapper.fromEntity(user));
    }
}
