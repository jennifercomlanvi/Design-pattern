package com.example.factory;

import com.example.dao.StudentDAO;

public interface DAOFactory {
    StudentDAO getStudentDAO();
}
