package com.cts.assignment;

import java.util.ArrayList;

import com.cts.assignment.model.*;

public class App {
	public static void main(String[] args) {

		// create FD Account
		FDAccount fDAccount = new FDAccount(2, 100000, java.time.LocalDate.now().plusMonths(12), 0.05,
				new ArrayList<Transaction>());
		System.out.println(fDAccount.getTenure());
		System.out.println(fDAccount.getMaturityAmount());
		System.out.println(fDAccount.getAccountDetails());

		// create SB Account
		SBAccount sBAccount = new SBAccount(1, 500000, 1000, new ArrayList<Transaction>());
		try {
			sBAccount.withdraw(100000);
		} catch (com.cts.assignment.exception.InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(sBAccount.getAccountDetails());

	}
}