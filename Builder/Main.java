package Builder;

public class Main {
    public static void main(String[] args) {
        // Création d’une commande de café avec le Builder
        CommandeCafe commande = new CommandeCafe.ConstructeurCommande(CommandeCafe.TypeCafe.NOIR) 
            .ajouterSucre(0.0)   // on précise qu’il n’y a pas de sucre
            .ajouterChantilly()  // on ajoute de la chantilly
            .construire();       // on construit l’objet final

        // Affichage de la commande
        commande.afficherCommande();

        // Ici on construit un café noir simple sans sucre ni options
        CommandeCafe commande2 = new CommandeCafe.ConstructeurCommande(CommandeCafe.TypeCafe.NOIR)
            .construire();
        commande2.afficherCommande();
    }
}
