from abc import ABC, abstractmethod

# =======================
# Patron Composite (Python)
# =======================
# On modélise une guilde avec des personnages simples (feuilles)
# et des chefs qui peuvent contenir d'autres personnages (composites).
# Chaque élément, qu'il soit simple ou composite, implémente la même interface.


# 1. Interface / Classe abstraite représentant un composant de la guilde
# ---------------------------------------------------------------------
# Cette classe sert de contrat pour tous les objets de la guilde.
# Tous doivent pouvoir "afficher leurs détails" (méthode afficherDetails).
class PersonnageComponent(ABC):
    @abstractmethod
    def afficherDetails(self, niveau=0):
        pass


# 2. Classe "feuille" : un aventurier simple
# ---------------------------------------------------------------------
# Un aventurier est un élément terminal (il n'a pas de subordonnés).
# Il implémente l'interface et affiche uniquement son nom + rôle.
class Personnage(PersonnageComponent):
    def __init__(self, nom, role):
        self.nom = nom
        self.role = role

    def afficherDetails(self, niveau=0):
        # "niveau" gère l'indentation pour représenter la hiérarchie
        indentation = "  " * niveau
        print(f"{indentation}- {self.nom} ({self.role})")


# 3. Classe "composite" : un chef qui peut contenir d’autres personnages
# ---------------------------------------------------------------------
# Un Chef peut avoir une liste de subordonnés (qui peuvent être des
# Personnage simples ou d'autres Chef).
# C'est ce qui rend la structure arborescente et récursive.
class Chef(PersonnageComponent):
    def __init__(self, nom, role="Chef"):
        self.nom = nom
        self.role = role
        self.subordonnes = []  # liste des "enfants" du chef

    def ajouter(self, personnage: PersonnageComponent):
        # Ajoute un subordonné (feuille ou composite)
        self.subordonnes.append(personnage)

    def retirer(self, personnage: PersonnageComponent):
        # Retire un subordonné
        self.subordonnes.remove(personnage)

    def afficherDetails(self, niveau=0):
        # Affiche d'abord le chef lui-même
        indentation = "  " * niveau
        print(f"{indentation}+ {self.nom} ({self.role})")
        # Puis appelle récursivement afficherDetails() de tous les subordonnés
        for sub in self.subordonnes:
            sub.afficherDetails(niveau + 1)


# 4. Exemple d’utilisation
# ---------------------------------------------------------------------
# On construit une hiérarchie de personnages :
# - Des personnages simples (feuilles)
# - Un chef intermédiaire
# - Un chef suprême contenant tout le monde
# Puis on affiche la guilde entière grâce à la récursivité.
if __name__ == "__main__":
    # Aventuriers simples (feuilles)
    guerrier = Personnage("Jennifer", "Guerrière")
    mage = Personnage("Prisca", "Mage")
    voleur = Personnage("Ernest", "Voleur")
    archer = Personnage("Fatou", "Archer")

    # Chef intermédiaire (composite avec 2 subordonnés)
    chef1 = Chef("Romaine", "Capitaine")
    chef1.ajouter(guerrier)
    chef1.ajouter(archer)

    # Chef suprême (composite racine avec plusieurs enfants)
    chefSupreme = Chef("Cosme", "Maître de Guilde")
    chefSupreme.ajouter(mage)       # feuille
    chefSupreme.ajouter(voleur)     # feuille
    chefSupreme.ajouter(chef1)      # composite (chef intermédiaire)

    # Affichage récursif de toute la guilde
    print("Composition de la Guilde :")
    chefSupreme.afficherDetails()
