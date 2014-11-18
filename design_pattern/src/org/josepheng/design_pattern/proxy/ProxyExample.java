package org.josepheng.design_pattern.proxy;

import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ProxyExample {
	public static void main(String[] args) {
		Bank bank = (Bank) Proxy.newProxyInstance(Bank.class.getClassLoader(),
				new Class[] { Bank.class },
				new BankProxyHandler(new BankImpl()));

		// construct account and added it into.
		List<Account> accounts = new LinkedList<Account>();
		Account account = new Account();
		account.setAccountName("CMB");
		account.setBalance(new BigDecimal(100000));
		account.setBankType("Credit Card");
		accounts.add(account);
		bank.setAccounts(accounts);

		// obtain account contents.
		Collection<Account> accountsContents = bank.getAccounts();
		
		for (Account ele : accountsContents) {
			System.out.println(String.format(
					"BankType:%1$s\tAccountName:%2$s\tBalance:%3$s",
					ele.getBankType(), ele.getAccountName(), ele.getBalance()));
		}

	}
}
