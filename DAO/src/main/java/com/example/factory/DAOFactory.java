package com.example.factory;

import com.example.dao.StudentDAO;

// Interface pour une "fabrique" de DAO
// L’idée : chaque fabrique concrète saura fournir une implémentation de StudentDAO
public interface DAOFactory {
    
    // Méthode qui retourne une implémentation de StudentDAO
    StudentDAO getStudentDAO();
}
