package com.example.factory;

import com.example.dao.StudentDAO;
import com.example.dao.impl.StudentDAOImpl;

public class DatabaseDAOFactory implements DAOFactory{
    public StudentDAO getStudentDAO() {
        return new StudentDAOImpl();
    }
}
