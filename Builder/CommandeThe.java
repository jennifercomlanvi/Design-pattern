package Builder;

public class CommandeThe {
    public CommandeThe(ConstructeurCommandeThe constructeurCommandeThe) {
    }

    public enum TypeLait { ENTIER, ECRIME, SOJA, AMANDE, NOIX_DE_COCO};
    public enum TypeThe { VERT, NOIR, BLANC, OOLONG, ROOIBOS, AROMATISE };
    public Double quantiteSucre;
    public boolean avecCitron;
    public boolean avecMiel;

    public static class ConstructeurCommandeThe {
        private Double quantiteSucre = 0.0;
        private TypeLait typeLait = null;
        private TypeThe typeThe;
        private boolean avecCitron = false;
        private boolean avecMiel = false;

        public ConstructeurCommandeThe(TypeThe type) {
            this.typeThe = type;
        }

        public ConstructeurCommandeThe definirLait(TypeLait type) {
            this.typeLait = type;
            return this;
        }

        public ConstructeurCommandeThe ajouterSucre(Double quantite) {
            this.quantiteSucre = quantite;
            return this;
        }

        public ConstructeurCommandeThe ajouterCitron() {
            this.avecCitron = true;
            return this;
        }

        public ConstructeurCommandeThe ajouterMiel() {
            this.avecMiel = true;
            return this;
        }

        public CommandeThe construire() {
            return new CommandeThe(this);
        }
    }
}
