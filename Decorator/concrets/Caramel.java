package Decorator.concrets;

import Decorator.Decorateur;
import Decorator.interfaces.Boisson;

public class Caramel extends Decorateur {
    // Description spécifique au caramel
    private String description;
    // Coût supplémentaire pour le caramel
    private Double cout;

    /**
     * Constructeur de la classe Caramel
     * @param boisson la boisson de base (ex: Café) ou déjà décorée
     */
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    /**
     * Retourne la description de la boisson en ajoutant "caramel"
     */
    @Override
    public String description() {
        return boisson.description() + description;
    }
    
    /**
    * Retourne le prix de la boisson en ajoutant le prix du caramel
    */
    @Override
    public Double cout() {
        return boisson.cout() + cout;
    }
    
}
