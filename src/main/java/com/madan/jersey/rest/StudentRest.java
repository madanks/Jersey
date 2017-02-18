package com.madan.jersey.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.madan.jersey.beans.Student;
import com.madan.jersey.exceptions.MyJerseyException;

@Path("student")
public class StudentRest {

	@POST
	@Path("addStudent")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addStudent(Student student) {
		if (student.getFirstName() == "") {
			// throw new MyJerseyException("First Name should not be empty");
			student.getFirstName().charAt(0);
		} else {
			System.out.println(student.toString());
		}
	}

	@GET
	@Path("listStudent")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudent() {
		return new Student(1, "Madan", "Siwakoti", "Surunga");
	}

}
