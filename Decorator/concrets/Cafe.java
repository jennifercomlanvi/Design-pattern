package Decorator.concrets;

import Decorator.interfaces.Boisson;

/**
 * Classe concrète représentant un café simple (une boisson de base).
 * C’est le composant "concret" du pattern Décorateur.
 */
public class Cafe implements Boisson {
    // Description de la boisson
    private String description;
    // Prix de base de la boisson
    private Double cout;
    /**
     * Constructeur de la classe Cafe
     * @param description description de la boisson
     * @param cout prix de la boisson
     */
    public Cafe(String description, Double cout) {
        this.description = description;
        this.cout = cout;
    }

    /**
     * Retourne la description de la boisson.
     * Implémente la méthode définie dans l’interface Boisson.
     */
    @Override
    public String description() {
        return this.description;
    }

    /**
     * Retourne le prix de la boisson.
     * Implémente la méthode définie dans l’interface Boisson.
     */
    @Override
    public Double cout() {
        return this.cout;
    }
    
}
