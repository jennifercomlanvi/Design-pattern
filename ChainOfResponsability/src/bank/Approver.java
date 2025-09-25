package ChainOfResponsability.src.bank;

// Classe abstraite qui représente un "maillon" de la chaîne
public abstract class Approver {
    protected Approver next; // maillon suivant

    // Permet de fixer le prochain maillon
    public void setNext(Approver next) {
        this.next = next;
    }

    // Méthode abstraite : chaque sous-classe décide si elle approuve ou passe au suivant
    public abstract void approve(int amount);
}
