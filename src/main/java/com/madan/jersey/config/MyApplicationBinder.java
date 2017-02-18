package com.madan.jersey.config;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

import com.madan.jersey.service.StudentService;

/**
 * @author Madan
 *
 */
public class MyApplicationBinder extends AbstractBinder {

	@Override
	protected void configure() {
		bind(StudentService.class).to(StudentService.class);
	}

}
