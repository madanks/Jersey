package com.madan.jersey.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import org.jvnet.hk2.annotations.Service;

import com.madan.jersey.beans.Student;

/**
 * @author Madan
 *
 */
@Singleton
@Service
public class StudentService {

	private List<Student> studentList = new ArrayList<>();

	public void addStudent(Student s) {
		studentList.add(s);
	}

	public List<Student> getStudents() {
		return studentList;
	}

}
