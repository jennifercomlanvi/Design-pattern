package Singleton;

public class ArbreBinaire {
    private Integer clef;
    private ArbreBinaire gauche;
    private ArbreBinaire droit;
    private static ArbreBinaire arbreVide;

    /**
     * Constructeur privé pour empêcher l'instanciation directe
     */
    private ArbreBinaire() {
        this.clef = null;
        this.gauche = null;
        this.droit = null;
    }
    /**
     * Méthode pour obtenir l'instance unique de l'arbre vide
     * @return
     */
    public static ArbreBinaire getInstance() {
        if (arbreVide == null) {
            return new ArbreBinaire();
        }
        return arbreVide;
    }
    /**
     * Getter et Setter
     * @return
     */
    public Integer getClef() {
        return clef;
    }
    public void setClef(Integer clef) {
        this.clef = clef;
    }

    public ArbreBinaire getGauche() {
        return gauche;
    }
    public void setGauche(ArbreBinaire gauche) {
        this.gauche = gauche;
    }

    public ArbreBinaire getDroit() {
        return droit;
    }
    public void setDroit(ArbreBinaire droit) {
        this.droit = droit;
    }

    public static ArbreBinaire creer(){
        return arbreVide;
    }

    public boolean estVide(){
        return this == arbreVide;
    }
    
    public void inserer(Integer valeur){
        if (this.estVide()){
            setClef(valeur);
        }else {
            if (this.getGauche() != null){
            this.getGauche().inserer(valeur);
            }else if (this.getDroit() != null){
                this.getDroit().inserer(valeur);
        }
    }
}

}
