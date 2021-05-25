package br.facens.livrosgamificados.livrosgamificados;

import br.facens.livrosgamificados.livrosgamificados.adapters.gateways.BookDataMapper;
import br.facens.livrosgamificados.livrosgamificados.adapters.gateways.JpaBookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    private final ApplicationContext context;

    public DatabaseSeeder(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Start seeding...");
        seedDatabase();
        System.out.println("Seeding Completed");
    }


    public void seedDatabase() {
        JpaBookRepository repo = context.getBean(JpaBookRepository.class);

        List<BookDataMapper> booksInDatabase = repo.findAll();

        if (booksInDatabase.size() == 0) {

            List<BookDataMapper> books = Arrays.asList(
                    new BookDataMapper("Livro Básico Sem Animação 1", 10000,  false, false),
                    new BookDataMapper("Livro Básico Sem Animação 2", 13000,  false, false),
                    new BookDataMapper("Livro Com Animação 1", 20000,  true, false),
                    new BookDataMapper("Livro Com Animação 2", 23000,  true, false),
                    new BookDataMapper("Livro Com Animação e Realidade Aumentada 1", 30000,  true, true),
                    new BookDataMapper("Livro Com Animação e Realidade Aumentada 2", 33000,  true, true)
            );



            repo.saveAll(books);
        }

    }
}
