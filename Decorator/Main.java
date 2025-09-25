import java.util.Scanner;u
import Decorator.concrets.Cafe;
import Decorator.concrets.Caramel;
import Decorator.concrets.Lait;
import Decorator.concrets.Sucre;
import Decorator.interfaces.Boisson;

public class Main {
    public static void main(String[] args) {
        // On crée une instance de Cafe
        // Cafe cafe = new Cafe("Café", 2.0);
        // On affiche la description et le cout du café
        // System.out.println(cafe.description() + " : " + cafe.cout() + "€")
        Scanner sc = new Scanner(System.in);

        Boisson boisson = new Cafe("Café", 2); 
        System.out.println("Vous avez choisi : " + boisson.description());

        boolean continuer = true;
        while (continuer) {
            System.out.println("\nQue voulez-vous ajouter ?");
            System.out.println("1. Lait (+0.5€)");
            System.out.println("2. Sucre (+0.2€)");
            System.out.println("3. Caramel (+0.7€)");
            System.out.println("4. Terminer");

            int choix = sc.nextInt();
            switch (choix) {
                case 1 -> boisson = new Lait(boisson);
                case 2 -> boisson = new Sucre(boisson);
                case 3 -> boisson = new Caramel(boisson);
                case 4 -> continuer = false;
                default -> System.out.println("Choix invalide !");
            }
        }

        System.out.println("\nVotre boisson : " + boisson.description());
        System.out.println("Coût total : " + boisson.cout() + "€");

        sc.close();
    }
}