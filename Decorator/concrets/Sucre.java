package Decorator.concrets;

import Decorator.Decorateur;
import Decorator.interfaces.Boisson;

/**
 * Classe concrète de décorateur : ajoute du sucre à une boisson.
 * Hérite de Decorateur, qui garde une référence vers une Boisson.
 */
public class Sucre extends Decorateur {
    // Description spécifique au sucre
    private String description;
    // Coût supplémentaire pour le sucre
    private Double cout;
    /**
     * Constructeur de la classe Sucre
     * @param boisson
     */
    public Sucre(Boisson boisson) {
        // Appel au constructeur de la classe mère
        super(boisson);
    }
    
    /**
     * Retourne la description de la boisson en ajoutant "sucre"
     */
    @Override
    public String description() {
        return boisson.description() + description;
    }
    
    /**
     * Retourne le prix de la boisson en ajoutant le prix du sucre
     */
    @Override
    public Double cout() {
        return boisson.cout() + cout;
    }
}
