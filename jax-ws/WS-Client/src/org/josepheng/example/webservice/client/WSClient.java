package org.josepheng.example.webservice.client;

import org.josepheng.example.webservice.Greeting;
import org.josepheng.example.webservice.GreetingImplService;

public class WSClient {
	public static void main(String[] args)
	{
		// client obtain the corresponding interface via wsdl's service.
		GreetingImplService service = new GreetingImplService();
		Greeting greeting = service.getGreetingImplPort();
		System.out.println("----> Call started");
		System.out.println(greeting.sayHello("Joseph"));
		System.out.println("<---- Call ended");
	}
}
