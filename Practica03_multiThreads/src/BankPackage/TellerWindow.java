package BankPackage;

public class TellerWindow extends Thread {
	private String name;
	private BankClient c;
	private long initialTime;
	
	public TellerWindow(String name, BankClient c, long initialTime) {
		super();
		this.name = name;
		this.c = c;
		this.initialTime = initialTime;
	}
	
	public TellerWindow(String name, long initialTime) {
		super();
		this.name = name;
		this.c = c;
		this.initialTime = initialTime;
	}

	@Override
	public void run() {
		System.out.println("The teller window " + this.name + " STARTS THE CUSTOMER'S PROCESSING " 
				+ this.c.getName() + " AT THE TIME BEING: " 
				+ (System.currentTimeMillis() - this.initialTime) / 1000 
				+ "seg");

		for (int i = 0; i < 10; i++) { 
			this.waitPseconds(c.getTime()); 
			System.out.println("processing customer service " + (i + 1) 
					+ " from client " + this.c.getName() + "->Time: " 
					+ (System.currentTimeMillis() - this.initialTime) / 1000 
					+ "seg");
		}

		System.out.println("The teller window " + this.name + " HAS FINISHED PROCESSING THE CUSTOMER " 
						+ this.c.getName() + " AT THE TIME BEING: " 
						+ (System.currentTimeMillis() - this.initialTime) / 1000 
						+ "sec");
	}
	
	private void waitPseconds(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	
	public BankClient getC() {
		return c;
	}

	public void setC(BankClient c) {
		this.c = c;
	}

	public long getInitialTime() {
		return initialTime;
	}

	public void setInitialTime(long initialTime) {
		this.initialTime = initialTime;
	}
	
	

}
