package br.facens.livrosgamificados.livrosgamificados.adapters.gateways;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<UserDataMapper, String> {
}
