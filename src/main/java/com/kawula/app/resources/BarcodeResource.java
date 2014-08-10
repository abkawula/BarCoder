package com.kawula.app.resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/barcode")
public class BarcodeResource {
	
	@GET
	@Produces("image/png")
	@Path("{text}")
	public Response getBarCode(@PathParam("text") String text) throws FileNotFoundException {
		return Response.ok(new FileInputStream("/home/adam/.dropbox-dist/"
				+ "dropbox-lnx.x86_64-2.10.27/images/hicolor/16x16/status"
				+ "/dropboxstatus-busy2.png")).build();
		
	}

}
