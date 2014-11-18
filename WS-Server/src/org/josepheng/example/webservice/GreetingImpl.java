package org.josepheng.example.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(endpointInterface = "org.josepheng.example.webservice.Greeting")
public class GreetingImpl implements Greeting {

	@Override
	public String sayHello(String name) {
		return String.format("Hello, %1$s. Welcome to JAX", name); 
	}

}
