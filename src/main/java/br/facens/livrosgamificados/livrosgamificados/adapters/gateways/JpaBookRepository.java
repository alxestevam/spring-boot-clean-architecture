package br.facens.livrosgamificados.livrosgamificados.adapters.gateways;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaBookRepository extends JpaRepository<BookDataMapper, String> {
    List<BookDataMapper> findAllByHasAnimationIsFalseAndHasAugmentedRealityIsFalse();
}
