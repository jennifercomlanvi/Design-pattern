package Decorator.concrets;

import Decorator.Decorateur;
import Decorator.interfaces.Boisson;

public class Caramel extends Decorateur {
    private String description;
    private Double cout;
    /**
     * Constructeur de la classe Caramel
     * @param boisson
     */
    public Caramel(Boisson boisson) {
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
