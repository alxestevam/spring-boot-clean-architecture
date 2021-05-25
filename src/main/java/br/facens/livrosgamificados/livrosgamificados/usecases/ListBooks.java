package br.facens.livrosgamificados.livrosgamificados.usecases;

import br.facens.livrosgamificados.livrosgamificados.entities.Book;
import br.facens.livrosgamificados.livrosgamificados.entities.SubscriptionPlan;
import br.facens.livrosgamificados.livrosgamificados.entities.User;

import java.util.List;

public class ListBooks implements ListBooksInputBoundary {
    private final LoadBooksGateway loadBooksGateway;

    public ListBooks(LoadBooksGateway loadBooksGateway) {
        this.loadBooksGateway = loadBooksGateway;
    }

    public List<Book> listForUser(User user) {
        if (user.getSubscriptionPlan() == SubscriptionPlan.Free) {
            return this.loadBooksGateway.loadBasics();
        }

        return this.loadBooksGateway.loadAll();
    }
}
