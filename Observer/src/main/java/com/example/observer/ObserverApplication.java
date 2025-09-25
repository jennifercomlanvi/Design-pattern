package Observer.src.main.java.com.example.observer;

public class ObserverApplication {

    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println(" Simulation du Marché Boursier ");
        System.out.println("====================================\n");
    
        // Créer des actions
        Stock apple17ProStock = new Stock("Apple 17 Pro Max", 2500.00);
        Stock apple17Stock = new Stock("Apple 17", 990.00);
    
        // Créer le marché boursier
        StockMarket stockMarket = new StockMarket();
        stockMarket.addStock(apple17ProStock);
        stockMarket.addStock(apple17Stock);
    
        // Créer des investisseurs
        Investor investor1 = new Investor("Jennifer");
        Investor investor2 = new Investor("Prisca");
        Investor investor3 = new Investor("Fatou");
    
        // Ajouter les investisseurs comme observateurs
        stockMarket.addObserver(investor1);
        stockMarket.addObserver(investor2);
        stockMarket.addObserver(investor3);
    
        System.out.println("\nInvestisseurs inscrits : Jennifer, Prisca, Fatou\n");
    
        // Simuler des changements de prix
        System.out.println("Mise à jour du prix : Apple 17 Pro Max -> 1500.00 €");
        stockMarket.setStockPrice("Apple 17 Pro Max", 1500.00);
    
        System.out.println("\nMise à jour du prix : Apple 17 -> 1600.00 €");
        stockMarket.setStockPrice("Apple 17", 1600.00);
    
        // Supprimer un investisseur et changer encore un prix
        System.out.println("\nL’investisseur Jennifer se retire du marché.");
        stockMarket.removeObserver(investor1);
    
        System.out.println("\nMise à jour du prix : Apple 17 Pro Max -> 1650.00 €");
        stockMarket.setStockPrice("Apple 17 Pro Max", 1650.00);
    
        System.out.println("\n====================================");
        System.out.println("Fin de la simulation ");
        System.out.println("====================================");
    }
}
