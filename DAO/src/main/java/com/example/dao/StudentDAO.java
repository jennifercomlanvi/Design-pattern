package com.example.dao;

// Importation de List pour renvoyer des collections d’objets
import java.util.List;

// Importation du modèle Student (classe représentant un étudiant)
import com.example.model.Student;

// Interface qui définit le contrat DAO pour les objets Student
public interface StudentDAO {

    // Crée (ajoute) un nouvel étudiant dans la base de données
    public void create(Student student);

    // Lit (récupère) un étudiant en fonction de son identifiant unique (id)
    public Student read(Long id);

    // Met à jour les informations d’un étudiant existant
    public void update(Student student);

    // Supprime un étudiant en fonction de son identifiant
    public void delete(Long id);

    // Retourne la liste de tous les étudiants
    public List<Student> listAll();
}
