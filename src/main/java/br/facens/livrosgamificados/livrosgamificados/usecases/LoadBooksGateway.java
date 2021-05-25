package br.facens.livrosgamificados.livrosgamificados.usecases;

import br.facens.livrosgamificados.livrosgamificados.entities.Book;

import java.util.List;

public interface LoadBooksGateway {
    List<Book> loadBasics();
    List<Book> loadAll();
}
