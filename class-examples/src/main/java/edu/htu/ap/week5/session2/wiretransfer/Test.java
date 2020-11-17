package edu.htu.ap.week5.session2.wiretransfer;

import edu.htu.ap.week5.session2.wiretransfer.WireTransfer.Status;

public class Test {

	public static void main(String[] args) {
		WireTransfer wt=new WireTransfer();
		Account fromAccount=new Account();
		fromAccount.setAccountNum(12314455);
		fromAccount.setName("jalal kiswani");
		AccountType type=new AccountType();
		type.setTypeCode(600);
		type.setTypeName("saving");
		fromAccount.setType(type);
		Bank bank=new Bank();
		bank.setBankCode(1234567);
		bank.setBankName("HDBC");
		fromAccount.setBank(bank);
		Branch branch=new Branch();
		branch.setCode(1233);
		branch.setName("Sweifeh");
		fromAccount.setBranch(branch);
		wt.setFromAccount(fromAccount);
		Account toAccount=new Account();
		toAccount.setAccountNum(12314455);
		toAccount.setName("jalal kiswani");
		AccountType type1=new AccountType();
		type1.setTypeCode(600);
		type1.setTypeName("saving");
		toAccount.setType(type1);
		Bank bank1=new Bank();
		bank1.setBankCode(1234567);
		bank1.setBankName("HDBC");
		toAccount.setBank(bank);
		Branch branch1=new Branch();
		branch1.setCode(1233);
		branch1.setName("Sweifeh");
		toAccount.setBranch(branch1);
		wt.setToAccount(toAccount);
		wt.setAmount(5000);
		Currency currency=new Currency();
		currency.setShortCode("USD");
		currency.setDescription("US dollars");
		currency.setRate(0.708);
		wt.setCurrency(currency);
		wt.setValueDate("11/11/2020");
		Status st=Status.NEW;
		wt.setStatus(st);
		System.out.println(wt);
		
		
		
		

	}

}
