package com.example.model;

// Classe modèle qui représente un étudiant
public class Student {
    // Identifiant unique de l’étudiant
    private Long id;

    // Prénom de l’étudiant
    private String firstName;

    // Nom de famille de l’étudiant
    private String lastName;

    // Âge de l’étudiant
    private int age;

    // Constructeur par défaut
    public Student() {}

    // Constructeur avec paramètres pour créer un étudiant complet
    public Student(Long id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // ======= Getters et Setters =======
    // Permettent d’accéder et de modifier les attributs privés

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // ======= toString =======
    // Retourne une chaîne lisible pour afficher un étudiant
    @Override
    public String toString() {
        return "Student { " +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                " }";
    }
}
