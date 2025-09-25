package Decorator.concrets;

import Decorator.Decorateur;
import Decorator.interfaces.Boisson;

public class Lait extends Decorateur {
    private String description;
    private Double cout;

    public Lait(Boisson boisson) {
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
