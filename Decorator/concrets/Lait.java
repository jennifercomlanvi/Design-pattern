package Decorator.concrets;

import Decorator.Decorateur;
import Decorator.interfaces.Boisson;

/**
 * Classe concrète de décorateur : ajoute du lait à une boisson.
 * Hérite de Decorateur, qui garde une référence vers une Boisson.
 */
public class Lait extends Decorateur {
    
    // Description spécifique au lait
    private String description;
    // Coût supplémentaire pour le lait
    private Double cout;
    /**
     * Constructeur de la classe Lait
     * @param boisson la boisson de base (ex: Café) ou déjà décorée
     */
    public Lait(Boisson boisson) {
        super(boisson);
    }

    /**
     * Retourne la description de la boisson en ajoutant "lait"
     */
    @Override
    public String description() {
        return boisson.description() + description;
    }
    
    /**
     * Retourne le prix de la boisson en ajoutant le prix du lait
     */
    @Override
    public Double cout() {
        return boisson.cout() + cout;
    }
    
}
