package Observer.src.main.java.com.example.observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    // Liste des observateurs
    private List<Observer> observers = new ArrayList<>();
    // Liste des actions suivies
    private List<Stock> stocks = new ArrayList<>();

    /**
     * Ajoute un observateur
     * @param observer
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Supprime un observateur
     * @param observer
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Ajoute une action au marché
     * @param stock
     */
    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    /**
     * Mise à jour du prix d’une action précise
     * @param stockName
     * @param newPrice
     */
    public void setStockPrice(String stockName, double newPrice) {
        for (Stock stock : stocks) {
            if (stock.getName().equalsIgnoreCase(stockName)) {
                stock.setPrice(newPrice);
                notifyObservers(stock);
            }
        }
    }

    /**
     * Notifier tous les observateurs du changement
     */
    private void notifyObservers(Stock stock) {
        for (Observer observer : observers) {
            observer.update(stock);
        }
    }
}
