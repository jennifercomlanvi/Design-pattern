package Decorator.concrets;

import Decorator.interfaces.Boisson;

public class Cafe implements Boisson {
    private String description;
    private Double cout;
    /**
     * Constructeur de la classe Cafe
     * @param description
     * @param cout
     */
    public Cafe(String description, Double cout) {
        this.description = description;
        this.cout = cout;
    }

    @Override
    public String description() {
        return this.description;
    }

    @Override
    public Double cout() {
        return this.cout;
    }
    
}
