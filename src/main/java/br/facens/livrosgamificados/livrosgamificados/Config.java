package br.facens.livrosgamificados.livrosgamificados;

import br.facens.livrosgamificados.livrosgamificados.adapters.gateways.JpaBook;
import br.facens.livrosgamificados.livrosgamificados.adapters.gateways.JpaBookRepository;
import br.facens.livrosgamificados.livrosgamificados.usecases.ListBooks;
import br.facens.livrosgamificados.livrosgamificados.usecases.ListBooksInputBoundary;
import br.facens.livrosgamificados.livrosgamificados.usecases.LoadBooksGateway;
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
}
