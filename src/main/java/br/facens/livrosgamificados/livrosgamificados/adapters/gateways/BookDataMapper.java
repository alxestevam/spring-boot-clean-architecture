package br.facens.livrosgamificados.livrosgamificados.adapters.gateways;

import br.facens.livrosgamificados.livrosgamificados.entities.Book;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class BookDataMapper {
    @Id
    private String title;
    private Integer cost;
    private Boolean hasAnimation;
    private Boolean hasAugmentedReality;

    public BookDataMapper() {}

    public BookDataMapper(String title, Integer cost, Boolean hasAnimation, Boolean hasAugmentedReality) {
        this.title = title;
        this.cost = cost;
        this.hasAnimation = hasAnimation;
        this.hasAugmentedReality = hasAugmentedReality;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Boolean getHasAnimation() {
        return hasAnimation;
    }

    public void setHasAnimation(Boolean hasAnimation) {
        this.hasAnimation = hasAnimation;
    }

    public Boolean getHasAugmentedReality() {
        return hasAugmentedReality;
    }

    public void setHasAugmentedReality(Boolean hasAugmentedReality) {
        this.hasAugmentedReality = hasAugmentedReality;
    }

    public Book toEntity() {
        Book book = new Book();
        book.setCost(this.cost);
        book.setHasAnimation(this.hasAnimation);
        book.setHasAugmentedReality(this.hasAugmentedReality);
        book.setTitle(this.title);
        return book;
    }
}
