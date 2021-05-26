package br.facens.livrosgamificados.livrosgamificados.adapters.gateways;

import br.facens.livrosgamificados.livrosgamificados.entities.Book;
import br.facens.livrosgamificados.livrosgamificados.usecases.LoadBooksGateway;

import java.util.ArrayList;
import java.util.List;

public class JpaBook implements LoadBooksGateway {
    private final JpaBookRepository jpaBookRepository;

    public JpaBook(JpaBookRepository jpaBookRepository) {
        this.jpaBookRepository = jpaBookRepository;
    }

    @Override
    public List<Book> loadBasics() {
        List<BookDataMapper> bookDataMappers = this.jpaBookRepository.findAllByHasAnimationIsFalseAndHasAugmentedRealityIsFalse();

        List<Book> books = new ArrayList<>();

        for (BookDataMapper dataMapper : bookDataMappers) {
            books.add(dataMapper.toEntity());
        }

        return books;
    }

    @Override
    public List<Book> loadAll() {
        List<BookDataMapper> bookDataMappers = this.jpaBookRepository.findAll();

        List<Book> books = new ArrayList<>();

        for (BookDataMapper dataMapper : bookDataMappers) {
            books.add(dataMapper.toEntity());
        }

        return books;
    }
}
