package com.example.factory;

import com.example.dao.StudentDAO;
import com.example.dao.impl.StudentDAOImpl;

// Fabrique concrète qui implémente l’interface DAOFactory
// Ici, cette fabrique retourne un StudentDAO basé sur StudentDAOImpl
public class DatabaseDAOFactory implements DAOFactory {

    // Fournit une instance de StudentDAO
    // Dans ce cas, on retourne un StudentDAOImpl (implémentation en mémoire ou BD)
    @Override
    public StudentDAO getStudentDAO() {
        return new StudentDAOImpl();
    }
}
