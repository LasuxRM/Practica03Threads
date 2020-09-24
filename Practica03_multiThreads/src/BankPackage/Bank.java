package BankPackage;

//import java.util.Scanner;

public class Bank extends Thread {
	
	public Bank(String name) {
		super(name);
	}
	public void run() {

		for(int i=0; i<10; i++) {
			
			try {
				sleep(3000); //3seconds 2 sleep
				System.out.println(i + " " + getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
//		new Bank("Juan").start();
//		new Bank("Maria").start();
//		Scanner sc = new Scanner(System.in);
//		String[] names = {"Julia","Marco","Paula","Juan"};
		String name = "Client ";
		for (int i=0; i<10; i++) {
			BankClient c = new BankClient(name + (i+1), (int) Math.floor(Math.random()*3 + 1)); 
			System.out.println("Client: "+c.getName()+"\nType: "+c.getType()+"\nPriority: "+c.getPriority()+"\nTime: "+c.getTime());
//			System.out.println((int) Math.floor(Math.random()*(200-5+1)+5));
		}
		
	
		
	}

}
