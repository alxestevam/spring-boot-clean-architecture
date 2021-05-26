package br.facens.livrosgamificados.livrosgamificados;

import br.facens.livrosgamificados.livrosgamificados.adapters.gateways.JpaBook;
import br.facens.livrosgamificados.livrosgamificados.adapters.gateways.JpaBookRepository;
import br.facens.livrosgamificados.livrosgamificados.adapters.gateways.JpaUser;
import br.facens.livrosgamificados.livrosgamificados.adapters.gateways.JpaUserRepository;
import br.facens.livrosgamificados.livrosgamificados.usecases.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config  {
    private final ApplicationContext context;

    public Config(ApplicationContext context) {
        this.context = context;
    }

    @Bean
    public LoadBooksGateway createJpaBook() {
        return new JpaBook(context.getBean(JpaBookRepository.class));
    }

    @Bean
    public ListBooksInputBoundary createListBooks() {
        return new ListBooks(createJpaBook());
    }

    @Bean
    public InsertUserGateway createJpaUser() {
        return new JpaUser(context.getBean(JpaUserRepository.class));
    }

    @Bean
    public SignUpUserInputBoundary createSignUpUser() {
        return new SignUpUser(createJpaUser());
    }
}
