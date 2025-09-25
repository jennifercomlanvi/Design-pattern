package Observer.src.main.java.com.example.observer;

public class Investor implements Observer {
    private String name;

    /**
     * Constructeur
     * @param name nom de l'investisseur
     */
    public Investor(String name) {
        this.name = name;
    }

    /**
     * Récupère le nom de l'investisseur
     * @return nom
     */
    public String getName() {
        return name;
    }

    /**
     * Mise à jour d'un stock
     * @param stock action modifiée
     */
    @Override
    public void update(Stock stock) {
        System.out.println("Notification pour l'investisseur " + name 
            + " : l'action [" + stock.getName() + "] vaut désormais " 
            + stock.getPrice() + " €.");
    }
}
