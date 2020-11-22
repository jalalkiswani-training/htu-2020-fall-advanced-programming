package edu.htu.ap.week6.session1.wiretransfer.again;

public class Test {
	public static void main(String[] args) {
		Account fromAccount=new Account();
		fromAccount.setName("Ata Jamal");
		fromAccount.setNumber("852369741");				
		fromAccount.setType(new AccountType(500,"Current"));
		fromAccount.setBank(new Bank(101,"ArabBank"));
		fromAccount.setBranch(new Branch(8569,"Abdali"));		

		Account toAccount=new Account();
		toAccount.setBank(new Bank(456, "Housing Bank"));
		toAccount.setBranch(new Branch(7458,"Mecca St"));
		toAccount.setName("Essa Talal");
		toAccount.setNumber("852369");
		toAccount.setType(new AccountType(600, "Saving"));

		Currency currency = new Currency("JOD","Jordan Dinar",1);

		WireTransfer wf=new WireTransfer();
		wf.setFromAccount(fromAccount);		
		wf.setToAccount(toAccount);
		
		wf.setAmount(5000);
		wf.setValueDate("22/11/2020");
		wf.setStatus(WireTransferStatus.NEW);
				
		wf.setCurrency(currency);
		sendTransfer(wf);
	}
	
	public static void sendTransfer(WireTransfer wf) {
		System.out.println(wf.getFromAccount().getName());
		System.out.println(wf.getAmount());
		System.out.println(wf.getToAccount().getBank().getName());
		/* ...
		 * 
		 */
		
	}
}
