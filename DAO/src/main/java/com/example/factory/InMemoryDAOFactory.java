package com.example.factory;

import com.example.dao.impl.StudentDAOImpl;

/**
 * Fabrique concrète qui retourne un StudentDAOImpl en mémoire.
 * Utile pour les tests ou pour une application simple sans vraie base de données.
 */
public class InMemoryDAOFactory implements DAOFactory {

    // Retourne une instance de StudentDAOImpl
    // Ici, l’implémentation StudentDAOImpl stocke les données en mémoire
    @Override
    public StudentDAOImpl getStudentDAO() {
        return new StudentDAOImpl();
    }
}
