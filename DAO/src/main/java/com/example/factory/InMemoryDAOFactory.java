package com.example.factory;

import com.example.dao.impl.StudentDAOImpl;

/**
 * Fabrique renvoyant un StudentDAOImpl en mémoire
 */
public class InMemoryDAOFactory implements DAOFactory {
    

    public StudentDAOImpl getStudentDAO() {
        return new StudentDAOImpl();
    }
    
}
