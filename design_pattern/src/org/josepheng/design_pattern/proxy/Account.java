package org.josepheng.design_pattern.proxy;

import java.math.BigDecimal;

/**
 * POJO template example.
 * 
 * @author hengwei
 *
 */
public class Account {
	public String bankType;
	public String accountName;
	public BigDecimal balance;

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getBankType() {
		return this.bankType;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}
}
