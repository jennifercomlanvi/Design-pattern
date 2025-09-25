package ChainOfResponsability.src.bank;

public class BranchManager extends Approver {
    /**
     * Approuve la demande jusqu'a ≤ 5000€, sinon la passe au suivant
     * @param amount Montant de la demande d'approbation
     */
    @Override
    public void approve(int amount) {
        if (amount <= 5000) {
            System.out.println("Le directeur de l'agence approuve " + amount + " €.");
        } else if (next != null) {
            next.approve(amount);  // passe au suivant
        }
    }
    
}
