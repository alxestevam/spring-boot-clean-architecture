package br.facens.livrosgamificados.livrosgamificados.adapters.gateways;

import br.facens.livrosgamificados.livrosgamificados.entities.Book;
import br.facens.livrosgamificados.livrosgamificados.usecases.LoadBooksGateway;

import java.util.List;

public class BookGateway implements LoadBooksGateway {
    @Override
    public List<Book> loadBasics() {
        return null;
    }

    @Override
    public List<Book> loadAll() {
        return null;
    }
}
