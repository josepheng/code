package org.josepheng.design_pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;

public class BankProxyHandler implements InvocationHandler {

	private Bank bank;
	public BankProxyHandler(Bank bank) {
		this.bank = bank;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		String methodName = method.getName();
		if("getAccounts".equals(methodName)) {
			
			// some operation to set accounts data.
			// ...
			
			return bank.getAccounts();
		} else if("setAccounts".equals(methodName)) {
			bank.setAccounts((Collection<Account>) args[0]);
			return null;
		} else {
			return null;
		}
	}

}
