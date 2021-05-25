package br.facens.livrosgamificados.livrosgamificados.usecases;

import br.facens.livrosgamificados.livrosgamificados.entities.Book;
import br.facens.livrosgamificados.livrosgamificados.entities.User;

import java.util.List;

public interface ListBooksInputBoundary {
    List<Book> listForUser(User user);
}
