package Builder;

public class Main {
    public static void main(String[] args) {
       CommandeCafe commande = new CommandeCafe.ConstructeurCommande(CommandeCafe.TypeCafe.NOIR)
            .ajouterSucre(0.0)
            .ajouterChantilly()
            .construire();
        commande.afficherCommande();

        //café noir simple
        // CommandeCafe commande2 = new CommandeCafe.ConstructeurCommande(CommandeCafe.TypeCafe.NOIR)
        //     .construire();
        // commande2.afficherCommande();
    }
}
