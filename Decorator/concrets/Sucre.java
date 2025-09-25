package Decorator.concrets;

import Decorator.Decorateur;
import Decorator.interfaces.Boisson;

public class Sucre extends Decorateur {
    private String description;
    private Double cout;
    /**
     * Constructeur de la classe Sucre
     * @param boisson
     */
    public Sucre(Boisson boisson) {
        // Appel au constructeur de la classe mère
        super(boisson);
    }
    @Override
    public String description() {
        return boisson.description() + description;
    }
    @Override
    public Double cout() {
        return boisson.cout() + cout;
    }
}
