package ChainOfResponsability.src.bank;

public class Teller extends Approver {
    /**
     * Approuve la demande jusqu’à 1000€, sinon la passe au suivant
     * @param amount Montant de la demande d'approbation
     */
    @Override
    public void approve(int amount) {
        if (amount <= 1000) {
            System.out.println("Le guichetier approuve " + amount + " €.");
        } else if (next != null) {
            next.approve(amount);  // passe au suivant
        }
    }
    
}
