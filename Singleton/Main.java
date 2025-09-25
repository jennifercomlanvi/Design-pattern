package Singleton;

public class Main {
    public static void main(String[] args) {
        // Creation d'un arbre vide
        ArbreBinaire arbre = ArbreBinaire.creer();
        // Insertion de valeurs
        arbre.setClef(10);
        arbre.setClef(5);
        arbre.setClef(15);
        arbre.setClef(3);
        arbre.setClef(7);

        // Affichage des valeurs
        System.out.println("Racine: " + arbre.getClef());
    }
}
