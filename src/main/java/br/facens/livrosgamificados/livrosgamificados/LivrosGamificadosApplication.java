package br.facens.livrosgamificados.livrosgamificados;

import br.facens.livrosgamificados.livrosgamificados.adapters.gateways.BookDataMapper;
import br.facens.livrosgamificados.livrosgamificados.adapters.gateways.JpaBookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication()
@EnableJpaRepositories(basePackages = "br.facens.livrosgamificados")
public class LivrosGamificadosApplication {
    public static void main(String[] args) {
        SpringApplication.run(LivrosGamificadosApplication.class, args);
    }
}
