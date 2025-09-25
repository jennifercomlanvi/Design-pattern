package ChainOfResponsability.src.bank;

public class RegionalDirector extends Approver {
    /**
     * Approuve la demande jusqu'a ≤ 20000€, sinon la refuse
     * @param amount Montant de la demande d'approbation
     */
    @Override
    public void approve(int amount) {
        if (amount <= 20000) {
            System.out.println("Le directeur régional approuve " + amount + " €.");
        } else {
            System.out.println("Le directeur régional refuse " + amount + " €.");
        }
    }
    
}
