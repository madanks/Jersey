package com.madan.jersey.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.madan.jersey.beans.Student;
import com.madan.jersey.exceptions.MyJerseyException;
import com.madan.jersey.service.StudentService;

/**
 * @author Madan
 *
 */
@Path("student")
public class StudentRest {

	@Inject
	private StudentService studentService;

	@POST
	@Path("addStudent")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addStudent(Student student) {
		if (student.getFirstName() == "") {
			// throw new MyJerseyException("First Name should not be empty");
			student.getFirstName().charAt(0);
		} else {
			System.out.println(student.toString());
			studentService.addStudent(student);
		}
	}

	@GET
	@Path("listStudent")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudent() {
		return studentService.getStudents();
	}

}
