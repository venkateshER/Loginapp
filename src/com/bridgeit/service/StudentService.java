package com.bridgeit.service;

import com.bridgeit.model.*;

public interface StudentService {
	public abstract Student validateStudentCredential(String email,	String password);
	public abstract boolean registerStudent(Student student);

}