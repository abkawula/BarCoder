package com.kawula.app;

import com.kawula.app.resources.BarcodeResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class BarCoderApplication extends Application<BarCoderConfiguration> {

	public static void main(String[] args) throws Exception {
		System.out.println(args);
        new BarCoderApplication().run(args);
    }
	
	@Override
	public void initialize(Bootstrap<BarCoderConfiguration> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run(BarCoderConfiguration configuration, Environment environment)
			throws Exception {
		final BarcodeResource resource = new BarcodeResource();
		environment.jersey().register(resource);
	}

}
