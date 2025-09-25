package Builder;

public class CommandeCafe {
    

    public enum TypeCafe { ESPRESSO,NOIR, AMERICANO, LATTE, CAPPUCCINO, MOCHA };
    public enum TypeLait { ENTIER, ECRIME, SOJA, AMANDE, NOIX_DE_COCO};

    private Double quantiteSucre;
    private TypeCafe typeCafe;
    private TypeLait typeLait;
    private boolean avecChantilly;
    private boolean avecCaramel;
    private boolean avecNoisette;
    private boolean avecVanille;
    private boolean avecCanelle;

    private CommandeCafe(TypeCafe type){
        this.typeCafe = type;
    }

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

    public void afficherCommande(){
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
            System.out.println("Avec canelle");
        }
    }
    
    public static class ConstructeurCommande{
        private Double quantiteSucre = 0.0;
        private TypeCafe typeCafe;
        private TypeLait typeLait = null;
        private boolean avecChantilly;
        private boolean avecCaramel;
        private boolean avecNoisette;
        private boolean avecVanille;
        private boolean avecCanelle;

        ConstructeurCommande(TypeCafe type){
            this.typeCafe = type;
        }

        public void afficherCommande(){
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
                System.out.println("Avec canelle");
            }
        }
        public ConstructeurCommande ajouterSucre(Double quantite){
            this.quantiteSucre = quantite;
            return this;
        }

        public ConstructeurCommande ajouterLait(TypeLait type){
            this.typeLait = type;
            return this;
        }

        public ConstructeurCommande ajouterChantilly(){
            this.avecChantilly = true;
            return this;
        }
        public ConstructeurCommande ajouterCaramel(){
            this.avecCaramel = true;
            return this;
        }
        public ConstructeurCommande ajouterNoisette(){
            this.avecNoisette = true;
            return this;
        }
        public ConstructeurCommande ajouterVanille(){
            this.avecVanille = true;
            return this;
        }
        public ConstructeurCommande ajouterCanelle(){
            this.avecCanelle = true;
            return this;
        }

        public CommandeCafe construire(){
            return new CommandeCafe(this);
        }

    }


}
