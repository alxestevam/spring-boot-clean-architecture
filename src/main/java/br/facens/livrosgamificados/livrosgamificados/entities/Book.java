package br.facens.livrosgamificados.livrosgamificados.entities;

public class Book {
    private Integer cost;
    private String title;
    private Boolean hasAnimation;
    private Boolean hasAugmentedReality;

    public Book() {}

    public Book(Integer cost, String title, Boolean hasAnimation, Boolean hasAugmentedReality) {
        this.cost = cost;
        this.title = title;
        this.hasAnimation = hasAnimation;
        this.hasAugmentedReality = hasAugmentedReality;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
}
