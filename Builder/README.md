# ☕🍵 TP – Design Pattern Builder (Java)

## 🎯 Objectif
Mettre en pratique le **pattern Builder** à travers la création d’objets complexes :  
- **CommandeCafe** → construire une commande de café avec différentes options (sucre, lait, chantilly, etc.).  
- **CommandeThe** → construire une commande de thé avec différentes options (sucre, lait, miel, citron, etc.).  

---

## 📂 Structure du projet

```
src/
 └── Builder/
      ├── CommandeCafe.java   # Classe + Builder pour les cafés
      ├── CommandeThe.java    # Classe + Builder pour les thés
      └── Main.java           # Classe de test
```

---

## 🚀 Exécution

### Depuis VS Code
- Ouvrir le dossier dans VS Code.  
- Clic droit sur `Main.java` → **Run Java**.  

### Depuis le terminal
Depuis le dossier `src/` :  

```bash
javac Builder/*.java
java Builder.Main
```

---

## ✅ Exemple de sortie

```
=== Commandes de café ===
Type de café: NOIR

Type de café: CAPPUCCINO
Type de lait: ENTIER
Quantité de sucre: 2.0
Avec chantilly
Avec caramel

Type de café: LATTE
Type de lait: SOJA
Avec vanille

=== Commandes de thé ===
Type de thé : VERT

Type de thé : NOIR
Avec citron
Avec miel

Type de thé : ROOIBOS
Avec lait : AMANDE
Quantité de sucre : 1.5
```

---
