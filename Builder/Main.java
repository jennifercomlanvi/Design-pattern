package Builder;

public class Main {
    public static void main(String[] args) {
        // ==================== TEST CommandeCafe ====================
        System.out.println("=== Commandes de café ===");

        // Exemple 1 : Café noir sans sucre ni lait
        CommandeCafe cafe1 = new CommandeCafe.ConstructeurCommande(CommandeCafe.TypeCafe.NOIR)
                .construire();
        cafe1.afficherCommande();

        // Exemple 2 : Cappuccino avec lait entier, sucre, chantilly et caramel
        CommandeCafe cafe2 = new CommandeCafe.ConstructeurCommande(CommandeCafe.TypeCafe.CAPPUCCINO)
                .ajouterLait(CommandeCafe.TypeLait.ENTIER)
                .ajouterSucre(2.0)
                .ajouterChantilly()
                .ajouterCaramel()
                .construire();
        cafe2.afficherCommande();

        // Exemple 3 : Latte avec lait de soja et vanille
        CommandeCafe cafe3 = new CommandeCafe.ConstructeurCommande(CommandeCafe.TypeCafe.LATTE)
                .ajouterLait(CommandeCafe.TypeLait.SOJA)
                .ajouterVanille()
                .construire();
        cafe3.afficherCommande();

        // ==================== TEST CommandeThe ====================
        System.out.println("\n=== Commandes de thé ===");

        // Exemple 1 : Thé vert nature
        CommandeThe the1 = new CommandeThe.ConstructeurCommandeThe(CommandeThe.TypeThe.VERT)
                .construire();
        the1.afficherCommande();

        // Exemple 2 : Thé noir avec miel et citron
        CommandeThe the2 = new CommandeThe.ConstructeurCommandeThe(CommandeThe.TypeThe.NOIR)
                .ajouterMiel()
                .ajouterCitron()
                .construire();
        the2.afficherCommande();

        // Exemple 3 : Rooibos avec lait d’amande et sucre
        CommandeThe the3 = new CommandeThe.ConstructeurCommandeThe(CommandeThe.TypeThe.ROOIBOS)
                .definirLait(CommandeThe.TypeLait.AMANDE)
                .ajouterSucre(1.5)
                .construire();
        the3.afficherCommande();
    }
}
