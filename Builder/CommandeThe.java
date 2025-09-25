package Builder;

// Classe principale qui représente une commande de thé
public class CommandeThe {

    // Constructeur utilisé par le builder pour créer une commande
    public CommandeThe(ConstructeurCommandeThe constructeurCommandeThe) {
        // Copie des valeurs du builder vers l’objet final
        this.typeThe = constructeurCommandeThe.typeThe;
        this.typeLait = constructeurCommandeThe.typeLait;
        this.quantiteSucre = constructeurCommandeThe.quantiteSucre;
        this.avecCitron = constructeurCommandeThe.avecCitron;
        this.avecMiel = constructeurCommandeThe.avecMiel;
    }

    // Enumération des types de lait possibles
    public enum TypeLait { ENTIER, ECRIME, SOJA, AMANDE, NOIX_DE_COCO };

    // Enumération des types de thé possibles
    public enum TypeThe { VERT, NOIR, BLANC, OOLONG, ROOIBOS, AROMATISE };

    // Attributs de la commande finale
    public Double quantiteSucre;  // quantité de sucre
    public boolean avecCitron;    // option citron
    public boolean avecMiel;      // option miel
    public TypeLait typeLait;     // type de lait (peut être null)
    public TypeThe typeThe;       // type de thé choisi

    // ==================== CLASSE BUILDER ====================
    // Classe interne qui sert à construire une CommandeThe
    public static class ConstructeurCommandeThe {
        // Valeurs par défaut
        private Double quantiteSucre = 0.0;
        private TypeLait typeLait = null;
        private TypeThe typeThe;
        private boolean avecCitron = false;
        private boolean avecMiel = false;

        // Constructeur qui oblige à préciser un type de thé
        public ConstructeurCommandeThe(TypeThe type) {
            this.typeThe = type;
        }

        // Définit le type de lait
        public ConstructeurCommandeThe definirLait(TypeLait type) {
            this.typeLait = type;
            return this; // permet d’enchaîner les appels
        }

        // Ajoute du sucre
        public ConstructeurCommandeThe ajouterSucre(Double quantite) {
            this.quantiteSucre = quantite;
            return this;
        }

        // Ajoute l’option citron
        public ConstructeurCommandeThe ajouterCitron() {
            this.avecCitron = true;
            return this;
        }

        // Ajoute l’option miel
        public ConstructeurCommandeThe ajouterMiel() {
            this.avecMiel = true;
            return this;
        }

        // Construit et retourne l’objet CommandeThe
        public CommandeThe construire() {
            return new CommandeThe(this);
        }
    }

    // ==================== MÉTHODE D'AFFICHAGE ====================
    // Affiche toutes les options de la commande
    public void afficherCommande() {
        System.out.println("Type de thé : " + this.typeThe);

        if (this.typeLait != null) {
            System.out.println("Avec lait : " + this.typeLait);
        }
        if (this.quantiteSucre > 0) {
            System.out.println("Quantité de sucre : " + this.quantiteSucre);
        }
        if (this.avecCitron) {
            System.out.println("Avec citron");
        }
        if (this.avecMiel) {
            System.out.println("Avec miel");
        }
    }
}
