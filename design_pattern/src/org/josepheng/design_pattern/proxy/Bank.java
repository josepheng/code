package org.josepheng.design_pattern.proxy;

import java.util.Collection;

public interface Bank {
	public Collection<Account> getAccounts();
	public void setAccounts(Collection<Account> accounts);
}
