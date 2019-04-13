package com.bridgeit.dao;

import com.bridgeit.model.Student;

public interface StudentDAO {
	public abstract boolean saveStudent(Student student);
	public Student getStudentDetailsByEmailAndPassword(String email,String password);
}
