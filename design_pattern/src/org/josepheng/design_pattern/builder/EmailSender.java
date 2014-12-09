package org.josepheng.design_pattern.builder;

public class EmailSender {
	/*
	 * multiply final parameters, which can only constructed via constructor
	 * But with more than two function parameters.
	 */
	private final String from;
	private final String to;
	private final String subject;
	
	/*
	 * the constructor is private(also I think if we put the EmailBuilder outside of the 
	 * EmailSender, we can make the constructor public, However, one of the side effect
	 * is that we can construct the EmailSender with constructor itself and the build()
	 * method of the EmailBuilder class. So, as a conclusion, the constructor must be 
	 * private here.)
	 */
	private EmailSender(EmailBuilder builder)
	{
		this.from = builder.from;
		this.to = builder.to;
		this.subject = builder.subject;
	}
	
	/*
	 * Builder class must be inner static. Which make sure that any time,..
	 * Wait why??
	 */
	public static class EmailBuilder implements ObjBuilder<EmailSender>
	{

		private String from;
		private String to;
		private String subject;
		
		/*
		 * The builder specific name conversion, Common, only used in builder pattern.
		 */
		public EmailBuilder from(String from)
		{
			from = from;
			return this;
		}
		
		public EmailBuilder to(String to)
		{
			to = to;
			return this;
		}
		
		public EmailBuilder subject(String subject)
		{
			subject = subject;
			return this;
		}
		
		/*
		 * The interface definition is really cool! also the only entry for creating
		 * a EmailSender object. the implementation is really cool! 
		 */
		@Override
		public EmailSender build() {
			return new EmailSender(this);
		}
	}
}
