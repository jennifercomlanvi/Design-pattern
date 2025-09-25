package Observer.src.main.java.com.example.observer;

public class Stock {
    private String name;
    private double price;

    /**
     * Constructeur
     * @param name
     * @param price
     */
    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Récupère le nom de l'action
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Get the price of the stock
     * @return
     */
    public double getPrice() {
        return price;
    }
    /**
     * Set the price of the stock
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
