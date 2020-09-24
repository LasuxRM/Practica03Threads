package BankPackage;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainThread {

	public static void main(String[] args) {
		
		String name = "Client ";
		ArrayList<BankClient> clients = new ArrayList<BankClient>();
		ArrayList<TellerWindow> tellers = new ArrayList<TellerWindow>();
		for (int i=0; i<10; i++) { //<i> could be i<2000
			BankClient c = new BankClient(name + (i+1), (int) Math.floor(Math.random()*3 + 1)); 
			clients.add(c);
			//System.out.println("Client: "+c.getName()+"\nType: "+c.getType()+"\nPriority: "+c.getPriority()+"\nTime: "+c.getTime());
		}
		for (int j=0; j<3; j++) {
			long initialTime = System.currentTimeMillis();
			TellerWindow tw = new TellerWindow("Teller"+(j+1),initialTime);
			tellers.add(tw);
		}
		
//		long initialTime = System.currentTimeMillis();
//		TellerWindow tw = new TellerWindow("Teller"+(i+1),c,initialTime);
//		tw.start();
		
		// Obtenemos un Iterador y recorremos la lista.
		ListIterator<BankClient> iter_c = clients.listIterator(clients.size());
		ListIterator<TellerWindow> iter_t = tellers.listIterator(tellers.size());
		
		while (iter_c.hasPrevious()){
			BankClient 		c 	=	iter_c.previous();
			while (iter_t.hasPrevious()) {
				TellerWindow 	tw	=	iter_t.previous();
				tw.setC(c);
				tw.start();
			}
			

			//System.out.println("Client: "+iter.previous().getName()+"\nType: "+iter.previous().getType()+"\nPriority: "+iter.previous().getPriority()+"\nTime: "+iter.previous().getTime());
		}

	}

}
