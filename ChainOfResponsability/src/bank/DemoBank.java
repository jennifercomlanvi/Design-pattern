package ChainOfResponsability.src.bank;

// Classe principale qui construit et teste la chaîne de responsabilité
public class DemoBank {
    public static void main(String[] args) {
        // Création des maillons
        Approver teller = new Teller();
        Approver manager = new BranchManager();
        Approver director = new RegionalDirector();

        // Construction de la chaîne
        teller.setNext(manager);
        manager.setNext(director);

        // Tests avec plusieurs montants
        int[] requests = {500, 2000, 10000, 50000};
        for (int amount : requests) {
            System.out.println("\n Demande de retrait : " + amount + " €");
            teller.approve(amount); // toujours commencer par le premier
        }
    }
}
