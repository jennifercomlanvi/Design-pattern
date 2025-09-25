package Builder;

// Classe principale qui représente une commande de café
public class CommandeCafe {
    
    // Types de café possibles
    public enum TypeCafe { ESPRESSO, NOIR, AMERICANO, LATTE, CAPPUCCINO, MOCHA };

    // Types de lait possibles
    public enum TypeLait { ENTIER, ECRIME, SOJA, AMANDE, NOIX_DE_COCO };

    // Attributs de la commande
    private Double quantiteSucre;      // quantité de sucre
    private TypeCafe typeCafe;         // type de café
    private TypeLait typeLait;         // type de lait (facultatif)
    private boolean avecChantilly;     // option chantilly
    private boolean avecCaramel;       // option caramel
    private boolean avecNoisette;      // option noisette
    private boolean avecVanille;       // option vanille
    private boolean avecCanelle;       // option cannelle

    // Constructeur privé qui force l’utilisation du builder
    private CommandeCafe(TypeCafe type){
        this.typeCafe = type;
    }

    // Constructeur qui reçoit un builder (ConstructeurCommande)
    private CommandeCafe(ConstructeurCommande constructeur){
        this.typeCafe = constructeur.typeCafe;
        this.typeLait = constructeur.typeLait;
        this.quantiteSucre = constructeur.quantiteSucre;
        this.avecChantilly = constructeur.avecChantilly;
        this.avecCaramel = constructeur.avecCaramel;
        this.avecNoisette = constructeur.avecNoisette;
        this.avecVanille = constructeur.avecVanille;
        this.avecCanelle = constructeur.avecCanelle;
    }

    // Méthode d'affichage de la commande finale
    public void afficherCommande(){
        // Règle métier : la chantilly nécessite du lait
        if(this.avecChantilly && this.typeLait == null){
            System.out.println("Une commande avec chantilly doit contenir du lait.");
            return;
        }

        System.out.println("Type de café: " + this.typeCafe);
            
        if(this.typeLait != null){
            System.out.println("Type de lait: " + this.typeLait);
        }
        if(this.quantiteSucre != 0.0){
            System.out.println("Quantité de sucre: " + this.quantiteSucre);
        }
        if(this.avecChantilly){
            System.out.println("Avec chantilly");
        }
        if(this.avecCaramel){
            System.out.println("Avec caramel");
        }
        if(this.avecNoisette){
            System.out.println("Avec noisette");
        }
        if(this.avecVanille){
            System.out.println("Avec vanille");
        }
        if(this.avecCanelle){
            System.out.println("Avec cannelle");
        }
    }
    
    // ==================== CLASSE BUILDER ====================
    public static class ConstructeurCommande{
        // Valeurs par défaut
        private Double quantiteSucre = 0.0;
        private TypeCafe typeCafe;
        private TypeLait typeLait = null;
        private boolean avecChantilly;
        private boolean avecCaramel;
        private boolean avecNoisette;
        private boolean avecVanille;
        private boolean avecCanelle;

        // Constructeur obligatoire : type de café
        ConstructeurCommande(TypeCafe type){
            this.typeCafe = type;
        }

        // Ajoute du sucre
        public ConstructeurCommande ajouterSucre(Double quantite){
            this.quantiteSucre = quantite;
            return this; // retourne le builder pour chaîner les appels
        }

        // Ajoute du lait
        public ConstructeurCommande ajouterLait(TypeLait type){
            this.typeLait = type;
            return this;
        }

        // Ajoute de la chantilly
        public ConstructeurCommande ajouterChantilly(){
            this.avecChantilly = true;
            return this;
        }

        // Ajoute du caramel
        public ConstructeurCommande ajouterCaramel(){
            this.avecCaramel = true;
            return this;
        }

        // Ajoute de la noisette
        public ConstructeurCommande ajouterNoisette(){
            this.avecNoisette = true;
            return this;
        }

        // Ajoute de la vanille
        public ConstructeurCommande ajouterVanille(){
            this.avecVanille = true;
            return this;
        }

        // Ajoute de la cannelle
        public ConstructeurCommande ajouterCanelle(){
            this.avecCanelle = true;
            return this;
        }

        // Construit la commande finale à partir du builder
        public CommandeCafe construire(){
            return new CommandeCafe(this);
        }
    }
}
