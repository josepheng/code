package org.josepheng.design_pattern.builder;

public class Test {
	public static void main(String[] args)
	{
		/*
		 * why the static class can use the new operator?
		 */
		EmailSender.EmailBuilder builder = new EmailSender.EmailBuilder();
		EmailSender sender = builder.from("Heng").to("Wei")
				.subject("Hello, Builder Pattern").build();
	}
}
