package org.josepheng.design_pattern.proxy;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class BankImpl implements Bank {

	// List is just a interface class.
	private List<Account> accounts;
	
	@Override
	public Collection<Account> getAccounts() {
		return this.accounts;
	}

	@Override
	public void setAccounts(Collection<Account> accounts) {

		this.accounts = new LinkedList<Account>();
		for(Account account : accounts)
		{
			this.accounts.add(account);
		}
	}

}
