package org.josepheng.example.webservice;

import javax.xml.ws.Endpoint;

public class WSPublisher {
	public static void main(String[] args)
	{
		Endpoint.publish("http://localhost:9999/ws/greeting", new GreetingImpl());
	}
}
