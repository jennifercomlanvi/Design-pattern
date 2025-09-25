package com.example.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.dao.StudentDAO;
import com.example.model.Student;

// Implémentation simple de StudentDAO
// Ici on utilise une liste en mémoire comme "base de données"
public class StudentDAOImpl implements StudentDAO {

    // Liste qui joue le rôle de stockage
    private List<Student> students = new ArrayList<>();

    // Crée (ajoute) un nouvel étudiant
    @Override
    public void create(Student student) {
        students.add(student);
        System.out.println("✅ Étudiant ajouté : " + student);
    }

    // Lit (récupère) un étudiant par son ID
    @Override
    public Student read(Long id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null; // si non trouvé
    }

    // Met à jour un étudiant existant
    @Override
    public void update(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(student.getId())) {
                students.set(i, student);
                System.out.println("Étudiant mis à jour : " + student);
                return;
            }
        }
        System.out.println("⚠️ Étudiant non trouvé pour mise à jour : " + student.getId());
    }

    // Supprime un étudiant par son ID
    @Override
    public void delete(Long id) {
        students.removeIf(s -> s.getId().equals(id));
        System.out.println("Étudiant supprimé avec ID : " + id);
    }

    // Retourne la liste de tous les étudiants
    @Override
    public List<Student> listAll() {
        return students;
    }
}
