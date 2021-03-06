package org.journeywithjava;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class FileCopy {

	public static void main(String[] args) throws Exception {

		CamelContext camelContext = new DefaultCamelContext();
		camelContext.addRoutes(new RouteBuilder(){

			@Override
			public void configure() throws Exception {
				
				from("file:D:\\JourneyWithJava\\from")
				.to("file:D:\\JourneyWithJava\\to");
			
			}
		});
		
		camelContext.start();
		Thread.sleep(10000);	// Add the thread sleep to allow camel to copy the file, otherwise program will get terminated.
		camelContext.stop();
		
	}

}
