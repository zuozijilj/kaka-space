package com.kaka.dao.account.impl;

public class AccountDaoImpl {

	private final static AccountDaoImpl instance = new AccountDaoImpl();
	
	public static AccountDaoImpl getInstance(){
		return instance;
	}
	
	public boolean insert(){
		return false;
	}
}
