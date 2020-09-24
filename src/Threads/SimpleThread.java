package Threads;

import UI.ProgressBar;
import UI.Window;

public class SimpleThread extends Thread{
	
	
	public static void main(String[] args) {
		
		Client		cli	= new Client("Anna", 18, 1);
		
		//Instanciando Window
		Window 		W1	= new Window();
		ProgressBar	pb	= new ProgressBar(cli);
		
		pb.setVisible(true);
		
		//W1.setVisible(true);
		
		//implementar priority con yeld
//		h1.setPriority(MAX_PRIORITY);
//		h2.setPriority(MIN_PRIORITY);
		
//		h1.start();
//		h2.start();
		
		
	}
}
