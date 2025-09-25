package ChainOfResponsability.src;

// Version naïve : tout est géré dans une seule classe avec if/else
public class Bank {
    // Méthode qui décide qui approuve la demande
    public static void approve(int amount) {
        if (amount <= 1000) {
            System.out.println("Le guichetier approuve " + amount + "€.");
        } else if (amount <= 5000) {
            System.out.println("Le directeur d’agence approuve " + amount + "€.");
        } else if (amount <= 20000) {
            System.out.println("Le directeur régional approuve " + amount + "€.");
        } else {
            System.out.println("Demande refusée : montant trop élevé (" + amount + "€).");
        }
    }

    public static void main(String[] args) {
        // Tests avec plusieurs montants
        int[] requests = {500, 2000, 10000, 50000};
        for (int amount : requests) {
            System.out.println("Demande de retrait : " + amount + " €");
            approve(amount);
        }

        // Problème de cette version :
        // Le code est rigide (si on ajoute un nouvel acteur, on doit modifier la méthode).
        // Violation du principe Ouvert/Fermé (chaque ajout demande une modification).
        //Pas réutilisable ni extensible.
    }
}

