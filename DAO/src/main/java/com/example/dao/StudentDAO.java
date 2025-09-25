package com.example.dao;

import java.util.List;

import com.example.model.Student;

public interface StudentDAO {
    public void create(Student student);
    public Student read(Long id);
    public void update(Student student);
    public void delete(Long id);
    public List<Student> listAll();
}