package org.josepheng.example.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Greeting {
	@WebMethod 
	String sayHello(String name);
}
