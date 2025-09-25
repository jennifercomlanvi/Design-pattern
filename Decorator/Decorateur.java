package Decorator;

import Decorator.interfaces.Boisson;

/**
 * Classe abstraite de décorateur qui implémente l'interface Boisson.
 */
public abstract class Decorateur implements Boisson {
    // Référence vers une boisson (composant ou autre décorateur)
    protected Boisson boisson;

    /**
     * Constructeur de la classe Decorateur
     * @param boisson la boisson à décorer
     */
    public Decorateur(Boisson boisson) {
        this.boisson = boisson;
    }
    
    /**
     * Retourne la description de la boisson décorée.
     */
    @Override
    public String description() {
        return boisson.description();
    }
    
    /**
     * Retourne le coût de la boisson décorée.
     */
    @Override
    public Double cout() {
        return boisson.cout();
    }
}
