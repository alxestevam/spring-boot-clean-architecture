package br.facens.livrosgamificados.livrosgamificados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication()
@EnableJpaRepositories(basePackages = "br.facens.livrosgamificados")
public class LivrosGamificadosApplication {
    public static void main(String[] args) {
        SpringApplication.run(LivrosGamificadosApplication.class, args);
    }
}
