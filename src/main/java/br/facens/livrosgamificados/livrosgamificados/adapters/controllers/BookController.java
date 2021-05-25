package br.facens.livrosgamificados.livrosgamificados.adapters.controllers;

import br.facens.livrosgamificados.livrosgamificados.entities.Book;
import br.facens.livrosgamificados.livrosgamificados.entities.SubscriptionPlan;
import br.facens.livrosgamificados.livrosgamificados.entities.User;
import br.facens.livrosgamificados.livrosgamificados.usecases.ListBooksInputBoundary;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("books")
public class BookController {
    private final ListBooksInputBoundary listBooksInput;

    BookController(ListBooksInputBoundary listBooksInput) {
        this.listBooksInput = listBooksInput;
    }


    @GetMapping()
    List<Book> getBooks() {
        User testUser = new User(SubscriptionPlan.Free, 10000);

        return this.listBooksInput.listForUser(testUser);
    }
}
