package com.madan.jersey.config;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author Madan
 *
 */
// -------------------- one way of configuration--------
/*
 * @ApplicationPath("madan") public class ApplicationConfiguration extends
 * Application {
 * 
 * @Override public Map<String, Object> getProperties() { Map<String, Object>
 * properties = new HashMap<String, Object>();
 * properties.put("jersey.config.server.provider.packages",
 * "com.madan.jersey.rest"); return properties; } }
 */

// ----------------------Another way of Configuration-------
@ApplicationPath("madan")
public class ApplicationConfiguration extends ResourceConfig {

	public ApplicationConfiguration() {
		register(new MyApplicationBinder());
		packages("com.madan.jersey.rest;com.madan.jersey.exceptions;com.madan.jersey.service");
	}

}
