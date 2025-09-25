# 🏦 TP – Chain of Responsibility (Java)

## 🎯 Objectif
Implémenter le **design pattern Chain of Responsibility** avec un scénario bancaire :  
- Guichetier approuve ≤ 1000€  
- Directeur d’agence approuve ≤ 5000€  
- Directeur régional approuve ≤ 20000€  
- Sinon → refus  

---

## 📂 Structure du projet

```
src/
 ├── Bank.java                   # Étape 1 : version naïve (if/else)
 └── bank/
      ├── Approver.java          # Handler abstrait
      ├── Teller.java            # Guichetier
      ├── BranchManager.java     # Directeur d’agence
      ├── RegionalDirector.java  # Directeur régional
      └── DemoBank.java          # Test de la chaîne
```

---

## 🚀 Exécution

### Depuis VS Code
- Ouvrir le dossier dans VS Code.  
- Clic droit sur `DemoBank.java` → **Run Java**.  

---

## ✅ Exemple de sortie

```
Demande de retrait : 500€
Le guichetier approuve 500€.

Demande de retrait : 2000€
Le directeur d’agence approuve 2000€.

Demande de retrait : 10000€
Le directeur régional approuve 10000€.

Demande de retrait : 50000€
Demande refusée : montant trop élevé (50000€).
```
---

## ❓ Questions théoriques

### 1. Avantages de CoR par rapport au if/else
- Découplage des responsabilités.  
- Ajout/retrait de maillons sans modifier le reste.  
- Respect du principe **Ouvert/Fermé** (Open/Closed Principle).  

### 2. Si on change l’ordre des maillons
- La logique est faussée (ex: si le directeur régional vient avant le guichetier).  

### 3. Ajouter un nouveau maillon (ex: Directeur national ≤ 100000€)
- Créer une nouvelle classe héritant de `Approver`.  
- L’insérer dans la chaîne sans toucher aux autres classes.  

### 4. Si aucun handler ne peut traiter la requête
- Afficher un message de refus (comme dans `RegionalDirector`).  
- OU créer un `DefaultHandler` qui gère ce cas.  
